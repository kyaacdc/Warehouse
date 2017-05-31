
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/kya/PlayFramework/play-java-jpa-react/conf/routes
// @DATE:Thu Jun 01 00:12:12 EEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProductController_1: controllers.ProductController,
  // @LINE:15
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProductController_1: controllers.ProductController,
    // @LINE:15
    Assets_0: controllers.Assets
  ) = this(errorHandler, ProductController_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/""", """controllers.ProductController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productsAsync/""", """controllers.ProductController.listAsync"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/new""", """controllers.ProductController.newProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/edit""", """controllers.ProductController.editProduct(ean:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/""" + "$" + """ean<[^/]+>""", """controllers.ProductController.details(ean:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/""", """controllers.ProductController.save"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/delete/""" + "$" + """ean<[^/]+>""", """controllers.ProductController.delete(ean:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ProductController_list0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/")))
  )
  private[this] lazy val controllers_ProductController_list0_invoker = createInvoker(
    ProductController_1.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "list",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """products/"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ProductController_listAsync1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productsAsync/")))
  )
  private[this] lazy val controllers_ProductController_listAsync1_invoker = createInvoker(
    ProductController_1.listAsync,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "listAsync",
      Nil,
      "GET",
      """""",
      this.prefix + """productsAsync/"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ProductController_newProduct2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/new")))
  )
  private[this] lazy val controllers_ProductController_newProduct2_invoker = createInvoker(
    ProductController_1.newProduct,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "newProduct",
      Nil,
      "GET",
      """""",
      this.prefix + """products/new"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ProductController_editProduct3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/edit")))
  )
  private[this] lazy val controllers_ProductController_editProduct3_invoker = createInvoker(
    ProductController_1.editProduct(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "editProduct",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """products/edit"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ProductController_details4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/"), DynamicPart("ean", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_details4_invoker = createInvoker(
    ProductController_1.details(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "details",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """products/""" + "$" + """ean<[^/]+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ProductController_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/")))
  )
  private[this] lazy val controllers_ProductController_save5_invoker = createInvoker(
    ProductController_1.save,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """products/"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ProductController_delete6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/delete/"), DynamicPart("ean", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_delete6_invoker = createInvoker(
    ProductController_1.delete(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "delete",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """product/delete/""" + "$" + """ean<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ProductController_list0_route(params) =>
      call { 
        controllers_ProductController_list0_invoker.call(ProductController_1.list)
      }
  
    // @LINE:7
    case controllers_ProductController_listAsync1_route(params) =>
      call { 
        controllers_ProductController_listAsync1_invoker.call(ProductController_1.listAsync)
      }
  
    // @LINE:8
    case controllers_ProductController_newProduct2_route(params) =>
      call { 
        controllers_ProductController_newProduct2_invoker.call(ProductController_1.newProduct)
      }
  
    // @LINE:9
    case controllers_ProductController_editProduct3_route(params) =>
      call(params.fromQuery[String]("ean", None)) { (ean) =>
        controllers_ProductController_editProduct3_invoker.call(ProductController_1.editProduct(ean))
      }
  
    // @LINE:10
    case controllers_ProductController_details4_route(params) =>
      call(params.fromPath[String]("ean", None)) { (ean) =>
        controllers_ProductController_details4_invoker.call(ProductController_1.details(ean))
      }
  
    // @LINE:11
    case controllers_ProductController_save5_route(params) =>
      call { 
        controllers_ProductController_save5_invoker.call(ProductController_1.save)
      }
  
    // @LINE:12
    case controllers_ProductController_delete6_route(params) =>
      call(params.fromPath[String]("ean", None)) { (ean) =>
        controllers_ProductController_delete6_invoker.call(ProductController_1.delete(ean))
      }
  
    // @LINE:15
    case controllers_Assets_versioned7_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
