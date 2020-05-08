package extension

class Extension_ {
    fun run(){
        val res1 = sum(3,2)
        val res2 = mul(sum(3,2), 2)

        val multi = {x: Int, y: Int -> x*y}

        val a = fun(a: Int, b: Int): Int {
            return a + b
        }

        val multi2: (Int, Int) -> Int = fun (a: Int, b: Int) : Int{
            return a +b
        }

        val multi3: (Int, Int) -> Int = {a:Int, b:Int -> a+b}

        val multi4 = {a: Int, b: Int -> a+b}

        var result = mul(10,20)

        val greet: () -> Unit = { print("!!")}

        val nestedLambda: (Int) -> (Int) -> Unit = {a: Int -> {b: Int -> print(a + b)}}

        val aaa = funcArgument(1, multi3)

        val sum3: Int.(Int) -> Int = {i -> plus(i) }
        val sum4 = fun Int.(a: Int): Int = a + 3

        100.pluu {
            print(it)
        }

        100.pluu2 {
            print(this)
        }
    }

    fun Int.pluu(block: (it: Int) -> Unit) = block(this)
    fun Int.pluu2(block: Int.() -> Unit) = block()

    fun sum(a: Int, b: Int) = a+b

    fun mul(a: Int, b: Int) = a*b

    fun funcArgument(a: Int, body: (b: Int, c: Int) -> Int){
        body(a, 2)
    }


}