
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/play/playapps/helloworld/conf/routes
// @DATE:Thu Oct 26 13:39:54 IST 2017


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
