class Singleton_ {

    fun run() {
        CommonUtils.anymore
        CommonUtils.dispMsg("like static call")
    }
}

object CommonUtils {
    var anymore: String = "hello"

    fun dispMsg(message: String){
        println(message)
    }
}
