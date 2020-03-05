class Loops_ {

    fun run(){

        val list = listOf("Hello", "World", "!")

        for(str in list){
            println(str)
        }

        for(i in 1..9){
            println(i)
        }

        for((index, str) in list.withIndex()){
            println("$str $index")
        }

        list.forEach { x ->
            println(x)
        }

        repeat(10) { i -> println(i) }

        outer@for(i in 1..2){
            inner@for(j in 1..2){
                println("$i $j")
                break
                break@inner
                break@outer
            }
        }

        var map = hashMapOf(1 to "foo", 2 to "bar")

        for((key, value) in map){
            println("Map [$key] = $value")
        }
    }
}