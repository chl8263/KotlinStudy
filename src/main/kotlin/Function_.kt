class Function_ {

    fun run() {
        println(listOf(1, 2, 3, 4).map { x -> addTwo(x) })
        println(listOf(1, 2, 3, 4).map(::addTwo))

        val a = Foo::a

        println(a)

        val lists = listOf(1, 2, 3, 4)

        val x = Point(1,1)
        val x2 = Point(2,2)

        println(x + x2)

        println(ListWrapper(listOf(1,2,3))[1])
    }

    data class ListWrapper(val wrapped: List<Int>){
        operator fun get(position: Int): Int = wrapped[position] + 100
    }

    data class Point(val x: Int, val y: Int)

    operator fun Point.plus(other: Point) = Point(x + other.x + 1, y + other.y + 1)



    fun cal(a: Int, b: Int) = a + b

    fun addTwo(x: Int) = x + 2

    inline fun inlineTest(a: Int, b: Int, op: (Int, Int)-> Int) : Int{
        return op(a,b)
    }

    fun test(){
        val ex = inlineTest(1,2){a: Int, b: Int -> a + b}
        println(ex)
    }

    fun sayMyName(name: String): String{
        return "Ewan"
    }

    inline fun sayMyName() = "qqq"



    class Foo(val a: String = "test") {

        fun foo(P0: Boolean, p1: Int, p2: Double): String {
            return "string"
        }

        fun foo2() = "string2"
    }

    object Foo2 {
        fun foo3() = "string3"
    }
}