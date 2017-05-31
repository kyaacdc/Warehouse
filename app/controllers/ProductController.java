package controllers;

import models.Product;
import models.ProductRepository;
import play.data.Form;
import play.data.FormFactory;
import play.db.jpa.Transactional;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Html;
import views.html.products.details;
import views.html.products.list;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static play.libs.Json.toJson;

public class ProductController extends Controller {

    private final FormFactory formFactory;
    private final ProductRepository productDao;
    private final HttpExecutionContext ec;

    @Inject
    public ProductController(FormFactory formFactory, ProductRepository productDao, HttpExecutionContext ec) {
        this.formFactory = formFactory;
        this.productDao = productDao;
        this.ec = ec;
    }

    @Transactional(readOnly = true)
    public Result list(){
        List<Product> products = productDao.findAll();
        Html render = list.render(products);
        return ok(render);
    }

    @Transactional(readOnly = true)
    public CompletionStage<Result> listAsync() {

        CompletionStage<Stream<Product>> allAsync = productDao.findAllAsync();

        /*
        CompletionStage<Result> promiseOfResult = allAsync.thenApply(a ->
                ok(list.render(a.collect(Collectors.toList())))
        );
        */

        CompletionStage<Result> resultCompletionStage = allAsync.thenApplyAsync(productStream -> {
            //return ok(toJson(productStream.collect(Collectors.toList())));
            return ok(list.render(productStream.collect(Collectors.toList())));
        }, ec.current());

        //return promiseOfResult;

        return resultCompletionStage;
    }

    public Result newProduct(){
        Form<Product> userForm = formFactory.form(Product.class);
        return ok(details.render(userForm));
    }

    @Transactional
    public Result editProduct(String ean){
        Product product = productDao.findOne(ean);
        Form<Product> userForm = formFactory.form(Product.class);
        Form<Product> filledForm = userForm.fill(product);
        return ok(details.render(filledForm));
    }

    @Transactional
    public Result details(String ean){
        final Product product = productDao.findOne(ean);

        if(product == null) {
            return notFound(String.format("Product %s does not exist.", ean));
        }
        Form<Product> userForm = formFactory.form(Product.class);
        Form<Product> filledForm = userForm.fill(product);
        flash("success", String.format("Product %s found", ean));
        return ok(details.render(filledForm));
    }

    @Transactional
    public Result save(){
        Form dynamicForm = formFactory.form().bindFromRequest("ean", "name", "description");
        if(dynamicForm.hasErrors()){
            flash("error", "Please correct form below.");
            return badRequest(details.render(dynamicForm));
        }

        Map<String, String> data = dynamicForm.data();
        Product product = new Product(
                data.get("ean"),
                data.get("name"),
                data.get("description"));
        product = productDao.add(product);
        flash("success", String.format("Successfully added product %s", product));
        return redirect(routes.ProductController.list());
    }

    @Transactional
    public Result delete(String ean){
        productDao.delete(ean);
        flash("success", String.format("Product %s removed", ean));
        return redirect(routes.ProductController.list());
    }

}
