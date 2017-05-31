
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/kya/PlayFramework/play-java-jpa-react/conf/routes
// @DATE:Thu Jun 01 00:12:12 EEST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
