class NullSafety_ {

    fun run(){

        var string: String? = "Hello!"

        println(string!!.length)

        if (string != null)
            println(string.length)

        val a: List<Int?> = listOf(1,2,3,4,null)

        val b: List<Int> = a.filterNotNull()

        val value : Int = a.first() ?: 404

        //val value2 : Int = a.first() ?: throw IllegalArgumentException(s = "Value cannot be null")

        val aa = if(a != null) a.size else 404
        val aa2 = a.size ?: 404

        val str: String? = null

        //print(str.length)
        println(str?.length)

        str?.apply {
            println("apply")
            println(this)
        }

        str.let {
            println("let")
            println(it)
        }
        println("==========")

        var aaa : A? = null

        println(aaa?.a)

    }
}

class A(){

    var a : String = "testA"
}