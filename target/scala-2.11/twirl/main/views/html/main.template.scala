
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(titleName: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.36*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
    """),format.raw/*13.5*/("""<title>"""),_display_(/*13.13*/titleName),format.raw/*13.22*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*14.50*/routes/*14.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.97*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*15.50*/routes/*15.56*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*15.106*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.55*/routes/*16.61*/.Assets.versioned("images/favicon.png")),format.raw/*16.100*/("""">
    </head>
    <body>
        <header class="header">
            <p>Welcome</p>
            <div class="container">
                """),_display_(/*22.18*/if(flash.containsKey("success"))/*22.50*/{_display_(Seq[Any](format.raw/*22.51*/("""
                    """),format.raw/*23.21*/("""<div class="alert alert-success">
                    """),_display_(/*24.22*/flash/*24.27*/.get("success")),format.raw/*24.42*/("""
                    """),format.raw/*25.21*/("""</div>
                """)))}),format.raw/*26.18*/("""
                """),_display_(/*27.18*/if(flash.containsKey("error"))/*27.48*/{_display_(Seq[Any](format.raw/*27.49*/("""
                    """),format.raw/*28.21*/("""<div class="alert alert-success">
                    """),_display_(/*29.22*/flash/*29.27*/.get("error")),format.raw/*29.40*/("""
                    """),format.raw/*30.21*/("""</div>
                """)))}),format.raw/*31.18*/("""
            """),format.raw/*32.13*/("""</div>
        </header>



        """),format.raw/*38.31*/("""
        """),_display_(/*39.10*/content),format.raw/*39.17*/("""

        """),format.raw/*41.9*/("""<footer class="footer">
            <div class="container">
                <p>Copyright @2017</p>
            </div>
        </footer>

    <script src=""""),_display_(/*47.19*/routes/*47.25*/.Assets.versioned("javascripts/main.js")),format.raw/*47.65*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(titleName:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(titleName)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (titleName) => (content) => apply(titleName)(content)

  def ref: this.type = this

}


}

/*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue May 30 11:47:47 EEST 2017
                  SOURCE: /home/kya/PlayFramework/play-java-jpa-react/app/views/main.scala.html
                  HASH: 8adbfdfc40eefe054b530ebcd75c618c809f3709
                  MATRIX: 997->255|1126->289|1154->291|1234->396|1266->401|1301->409|1331->418|1416->476|1431->482|1493->523|1572->575|1587->581|1659->631|1743->688|1758->694|1819->733|1984->871|2025->903|2064->904|2113->925|2195->980|2209->985|2245->1000|2294->1021|2349->1045|2394->1063|2433->1093|2472->1094|2521->1115|2603->1170|2617->1175|2651->1188|2700->1209|2755->1233|2796->1246|2860->1371|2897->1381|2925->1388|2962->1398|3144->1554|3159->1560|3220->1600
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|52->22|52->22|52->22|53->23|54->24|54->24|54->24|55->25|56->26|57->27|57->27|57->27|58->28|59->29|59->29|59->29|60->30|61->31|62->32|67->38|68->39|68->39|70->41|76->47|76->47|76->47
                  -- GENERATED --
              */
          