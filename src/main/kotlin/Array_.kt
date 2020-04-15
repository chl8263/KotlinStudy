import java.util.*

class Array_ {
    fun run() = empty()

    fun empty() {
        val emptyArr = emptyArray<String>()

        for (x in emptyArr)
            println(x)

        var arr = Array<String>(size = 5, init = { index -> "Item #$index" })

        println(Arrays.toString(arr))
        println(arr.size)

//        emptyArr.set(1, "A")
//        emptyArr.set(2, "B")
        emptyArr[1] = "A"
        emptyArr[2] = "B"
    }
}
