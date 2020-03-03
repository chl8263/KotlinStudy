class Vararg_ {

    fun run(){
        printNumber(0, 1)
        printNumber(10, 11, 12, 13)
    }

    fun printNumber(vararg numbers: Int){
        for (number in numbers){
            println(number)
        }
    }
}