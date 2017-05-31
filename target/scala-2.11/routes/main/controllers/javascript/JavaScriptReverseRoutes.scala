
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/kya/PlayFramework/play-java-jpa-react/conf/routes
// @DATE:Thu Jun 01 00:12:12 EEST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:6
  class ReverseProductController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def listAsync: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.listAsync",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productsAsync/"})
        }
      """
    )
  
    // @LINE:10
    def details: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.details",
      """
        function(ean0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ean", encodeURIComponent(ean0))})
        }
      """
    )
  
    // @LINE:9
    def editProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.editProduct",
      """
        function(ean0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/edit" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ean", ean0)])})
        }
      """
    )
  
    // @LINE:6
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/"})
        }
      """
    )
  
    // @LINE:12
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.delete",
      """
        function(ean0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/delete/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ean", encodeURIComponent(ean0))})
        }
      """
    )
  
    // @LINE:11
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "products/"})
        }
      """
    )
  
    // @LINE:8
    def newProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.newProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/new"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
