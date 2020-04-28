class TypeSafeBuilder_ {

    var function: () -> Unit = {print("test")}

    var f: AA.()-> Unit = {}

    fun run (){
        b(::a)

        val c: (String) -> Unit = {s -> println("$s function c") }

        b(c)

        c("a")
    }

    fun a (str: String){
        println("$str function a")
    }

    fun b (function: (str: String) -> Unit){
        function("call from b")
    }
}

data class Person(
    var name: String? = null,
    var age: Int? = null,
    val children: MutableList<Person> = mutableListOf()
){
    fun child(init: Person.() -> Unit) = Person().also {
        it.init()
        children.add(it)
    }
}

class AA{
    var a = 1
}