package basic

class Basic {

    fun run() = nullHold()


    fun printHello(name : String?) : Unit{
        if(name != null){
            println("Hello $name")
        }
    }

    fun double (x : Int) : Int = x *2

    fun nullHold(){
        var a : String? = "123"
        a = null
    }

}