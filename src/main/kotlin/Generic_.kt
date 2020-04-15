class Generic_ {

    fun run(){

        val box1: Box<Int> = Box<Int>(1)
        val box2: Box<String> = Box("Hello")
        print(box1.name)
        print(box2.name)
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

class Box<T> (t: T){
    var name = t
}