
package views.html.products

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object list_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object list_Scope1 {
import java.util

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(products: util.List[Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.32*/("""

"""),_display_(/*4.2*/main("ProductController catalogue")/*4.37*/ {_display_(Seq[Any](format.raw/*4.39*/("""

    """),format.raw/*6.5*/("""<h2>All products</h2>

    <table class="table table-striped">
        <thead>
            <tr>
                <th>EAN</th>
                <th>Name</th>
                <th>Description</th>
                <th>Remove</th>
            </tr>
        </thead>
        <tbody>
        """),_display_(/*18.10*/for(product <- products) yield /*18.34*/ {_display_(Seq[Any](format.raw/*18.36*/("""
            """),format.raw/*19.13*/("""<tr>
                <td>
                """),_display_(/*21.18*/product/*21.25*/.ean),format.raw/*21.29*/("""
                """),format.raw/*22.17*/("""</td>
                <td>
                    <a href=""""),_display_(/*24.31*/routes/*24.37*/.ProductController.details(product.ean)),format.raw/*24.76*/("""">
                    """),_display_(/*25.22*/product/*25.29*/.name),format.raw/*25.34*/("""
                    """),format.raw/*26.21*/("""</a>
                </td>
                <td>
                    """),_display_(/*29.22*/product/*29.29*/.description),format.raw/*29.41*/("""
                """),format.raw/*30.17*/("""</td>
                <td>
                    <a href=""""),_display_(/*32.31*/routes/*32.37*/.ProductController.delete(product.ean)),format.raw/*32.75*/("""" class="btn">
                        <i class="glyphicon-minus"></i> Delete
                    </a>
                </td>
            </tr>
        """)))}),format.raw/*37.10*/("""
        """),format.raw/*38.9*/("""</tbody>
    </table>

    <a href=""""),_display_(/*41.15*/routes/*41.21*/.ProductController.newProduct()),format.raw/*41.52*/("""" class="btn">
        <i class="glyphicon-plus"></i> New product
    </a>

    """),format.raw/*45.28*/("""
    """),format.raw/*46.5*/("""<table class="table table-striped">
        <thead>
            <tr>
                <th>Number</th>
                <th>EAN</th>
                <th>Name</th>
                <th>Description</th>
                <th>Remove</th>
                <th>Edit</th>
            </tr>
        </thead>
        <tbody>
        """),_display_(/*58.10*/for((product, i) <- products.zipWithIndex) yield /*58.52*/ {_display_(Seq[Any](format.raw/*58.54*/("""
            """),format.raw/*59.13*/("""<tr>
                <td>
                """),_display_(/*61.18*/i),format.raw/*61.19*/("""
                """),format.raw/*62.17*/("""</td>
                <td>
                """),_display_(/*64.18*/product/*64.25*/.ean),format.raw/*64.29*/("""
                """),format.raw/*65.17*/("""</td>
                <td>
                    <a href=""""),_display_(/*67.31*/routes/*67.37*/.ProductController.details(product.ean)),format.raw/*67.76*/("""">
                    """),_display_(/*68.22*/product/*68.29*/.name),format.raw/*68.34*/("""
                    """),format.raw/*69.21*/("""</a>
                </td>
                <td>
                """),_display_(/*72.18*/product/*72.25*/.description),format.raw/*72.37*/("""
                """),format.raw/*73.17*/("""</td>
                <td>
                    <a href=""""),_display_(/*75.31*/routes/*75.37*/.ProductController.delete(product.ean)),format.raw/*75.75*/("""" class="btn">
                        <i class="glyphicon-minus"></i> Delete
                    </a>
                </td>
                <td>
                    <a href=""""),_display_(/*80.31*/routes/*80.37*/.ProductController.editProduct(product.ean)),format.raw/*80.80*/("""" class="btn">
                        <i class="glyphicon-apple"></i> Edit product
                    </a>
                </td>
            </tr>
        """)))}),format.raw/*85.10*/("""
        """),format.raw/*86.9*/("""</tbody>
    </table>

""")))}))
      }
    }
  }

  def render(products:util.List[Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((util.List[Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


}
}

/**/
object list extends list_Scope0.list_Scope1.list
              /*
                  -- GENERATED --
                  DATE: Thu Jun 01 00:10:26 EEST 2017
                  SOURCE: /home/kya/PlayFramework/play-java-jpa-react/app/views/products/list.scala.html
                  HASH: 68bdf5e4c9ffe257bd1a8c284b9b78e73d4541e9
                  MATRIX: 808->19|933->49|961->52|1004->87|1043->89|1075->95|1386->379|1426->403|1466->405|1507->418|1577->461|1593->468|1618->472|1663->489|1747->546|1762->552|1822->591|1873->615|1889->622|1915->627|1964->648|2060->717|2076->724|2109->736|2154->753|2238->810|2253->816|2312->854|2495->1006|2531->1015|2595->1052|2610->1058|2662->1089|2770->1192|2802->1197|3148->1516|3206->1558|3246->1560|3287->1573|3357->1616|3379->1617|3424->1634|3495->1678|3511->1685|3536->1689|3581->1706|3665->1763|3680->1769|3740->1808|3791->1832|3807->1839|3833->1844|3882->1865|3974->1930|3990->1937|4023->1949|4068->1966|4152->2023|4167->2029|4226->2067|4429->2243|4444->2249|4508->2292|4697->2450|4733->2459
                  LINES: 30->2|35->2|37->4|37->4|37->4|39->6|51->18|51->18|51->18|52->19|54->21|54->21|54->21|55->22|57->24|57->24|57->24|58->25|58->25|58->25|59->26|62->29|62->29|62->29|63->30|65->32|65->32|65->32|70->37|71->38|74->41|74->41|74->41|78->45|79->46|91->58|91->58|91->58|92->59|94->61|94->61|95->62|97->64|97->64|97->64|98->65|100->67|100->67|100->67|101->68|101->68|101->68|102->69|105->72|105->72|105->72|106->73|108->75|108->75|108->75|113->80|113->80|113->80|118->85|119->86
                  -- GENERATED --
              */
          