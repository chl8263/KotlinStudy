class Interfaces_ {

    fun run() {
        val myinterfacesClass = MyInterfacesClass()
        myinterfacesClass.withImplementation()

        println(myinterfacesClass.helloWorld)
    }
}

class MyInterfacesClass : MyInterface{
}

class DuplecateInterfaceClass : ABC, ABCD{
    override fun a() {
        super<ABC>.a()
    }

}

interface MyInterface{
    fun withImplementation(){
        println("withImplementation() was called")
    }

    val helloWorld
        get() = "hello World"
}

interface ABC{
    fun a (){println("abc")}
}

interface ABCD{
    fun a (){println("abcD")}
}