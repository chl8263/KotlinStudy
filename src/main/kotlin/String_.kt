class String_ {

    fun run() = element()

    fun literal (){
        val a = "Hello \n Hello"
        val b = "Hello \t Hello"
        val c = "Hello \b Hello"
        val d = "Hello \r Hello"
        val e = "Hello \' Hello"
        val f = "Hello \" Hello"
        val g = "Hello \\ Hello"
        val h = "Hello \$ Hello"

        println(a)
        println(b)
        println(c)
        println(d)
        println(e)
        println(f)
        println(g)
        println(h)
    }

    fun literal2(){
        val text = """      
            |for (c in foo)
            |    print(c)
            """.trimMargin()

        println(text)
    }

    fun element(){
        val str = "Hello, World!"
        println(str[1])

        for(x in str){
            println(x)
        }
    }
}