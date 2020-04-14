class Generic_ {

    fun run(){
    }

    private fun printAll(items: ArrayList<out OutPut<String>>){
        items.indices
            .filter { items[it].isArgument("") }
            .forEach { println("item : " + items[it]) }
    }
}

interface OutPut<T>{
    fun isArgument(argument: T): Boolean
}

class ExampleUniTest {
    val items = ArrayList<OutPut<String>>()

    init {
        items.add(object : OutPut<String>{
            override fun isArgument(argument: String): Boolean = false
        })

        items.add(object : OutPut<String>{
            override fun isArgument(argument: String): Boolean = true
        })
    }
}