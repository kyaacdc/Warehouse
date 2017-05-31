
package views.html.products

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object details_Scope0 {
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

class details extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(myForm: Form[Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/main("Product form")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<h1>Product form</h1>

    """),_display_(/*6.6*/if(myForm.value().isPresent)/*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
        """),format.raw/*7.9*/("""<ul>
            <li>ean - """),_display_(/*8.24*/myForm/*8.30*/.value().get().ean),format.raw/*8.48*/("""</li>
            <li>name - """),_display_(/*9.25*/myForm/*9.31*/.value().get().name),format.raw/*9.50*/("""</li>
            <li>description - """),_display_(/*10.32*/myForm/*10.38*/.value().get().description),format.raw/*10.64*/("""</li>
        </ul>
    """)))}/*12.7*/else/*12.12*/{_display_(Seq[Any](format.raw/*12.13*/("""
        """),_display_(/*13.10*/helper/*13.16*/.form(action = routes.ProductController.save())/*13.63*/ {_display_(Seq[Any](format.raw/*13.65*/("""
            """),format.raw/*14.13*/("""<fieldset>
                <legend>Product ("""),_display_(/*15.35*/myForm("name")/*15.49*/.valueOr("Newww")),format.raw/*15.66*/(""")</legend>
                """),_display_(/*16.18*/helper/*16.24*/.inputText(myForm("ean"))),format.raw/*16.49*/("""
                """),_display_(/*17.18*/helper/*17.24*/.inputText(myForm("name"))),format.raw/*17.50*/("""
                """),_display_(/*18.18*/helper/*18.24*/.inputText(myForm("description"))),format.raw/*18.57*/("""
            """),format.raw/*19.13*/("""</fieldset>
            <input type="submit" class="btn btn-primary" value="Save">

            <a href=""""),_display_(/*22.23*/routes/*22.29*/.ProductController.list()),format.raw/*22.54*/("""" class="btn">Cancel</a>
        """)))}),format.raw/*23.10*/("""
    """)))}),format.raw/*24.6*/("""


""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(myForm:Form[Product]): play.twirl.api.HtmlFormat.Appendable = apply(myForm)

  def f:((Form[Product]) => play.twirl.api.HtmlFormat.Appendable) = (myForm) => apply(myForm)

  def ref: this.type = this

}


}

/**/
object details extends details_Scope0.details
              /*
                  -- GENERATED --
                  DATE: Thu Jun 01 00:15:36 EEST 2017
                  SOURCE: /home/kya/PlayFramework/play-java-jpa-react/app/views/products/details.scala.html
                  HASH: d0f8f57b7cd79a224ae68aa19ade2613c658b85a
                  MATRIX: 765->1|883->24|911->27|939->47|978->49|1009->54|1062->82|1098->110|1137->112|1172->121|1226->149|1240->155|1278->173|1334->203|1348->209|1387->228|1451->265|1466->271|1513->297|1556->323|1569->328|1608->329|1645->339|1660->345|1716->392|1756->394|1797->407|1869->452|1892->466|1930->483|1985->511|2000->517|2046->542|2091->560|2106->566|2153->592|2198->610|2213->616|2267->649|2308->662|2441->768|2456->774|2502->799|2567->833|2603->839|2637->843
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|43->12|44->13|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|53->22|53->22|53->22|54->23|55->24|58->27
                  -- GENERATED --
              */
          