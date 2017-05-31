package models;

import play.db.jpa.JPAApi;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class ProductRepositoryImpl implements ProductRepository{

    private JPAApi jpaApi;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public ProductRepositoryImpl (JPAApi jpaApi, DatabaseExecutionContext executionContext) {
        this.jpaApi = jpaApi;
        this.executionContext = executionContext;
    }

    @Override
    public List<Product> findAll() {
        return jpaApi.em().createQuery("select p from Product p", Product.class).getResultList();
    }

    @Override
    public CompletionStage<Stream<Product>> findAllAsync() {
        //return supplyAsync(() -> wrap(em -> list(em)), executionContext);

        List<Product> products = jpaApi.em().createQuery("select p from Product p", Product.class).getResultList();
        Stream<Product> productStreamWithTran = jpaApi.withTransaction(() -> products.stream());

        return supplyAsync(() -> productStreamWithTran, executionContext);
        //return supplyAsync(() -> productStreamWithTran);

    }


    @Override
    public Product findOne(String ean) {
        return jpaApi.em().find(Product.class, ean);
    }

    @Override
    public Product add(Product product) {
        return jpaApi.em().merge(product);
    }

    @Override
    public void delete(String ean) {
        jpaApi.em().remove(findOne(ean));
    }
/*
    private Stream<Product> list(EntityManager em) {
        List<Product> products = em.createQuery("select p from Product p", Product.class).getResultList();
        return products.stream();
    }

    private <T> T wrap(Function<EntityManager, T> function) {
        return jpaApi.withTransaction(function);
    }
*/

}
