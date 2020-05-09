import java.lang.StringBuilder

class TypeSafeBuilder_ {

    fun run (){

        val a = buildString{
            append("a")
        }
        print(a)
    }

    inline fun buildString(builderAction: StringBuilder.()->Unit): String {

        val sb = StringBuilder()
        sb.builderAction()

        return sb.toString()
    }

    fun <T> T.ewan(block: T.() -> Unit): T{
        block()
        return this
    }

}
