class Collection_ {

    fun run() = set()

    fun list() {
        val list = listOf("Item1", "Item2", "Item3")
        //list.add("Item4")
        println(list)

        val list2 = mutableListOf("Item1", "Item2", "Item3")
        list2.add("Item4")
        println(list)

    }

    fun map() {
        val map = mapOf(Pair(1, "Item1"), Pair(2, "Item2"), Pair(3, "Item3"))

        val map2 = mutableMapOf(Pair(1, "Item1"), Pair(2, "Item2"), Pair(3, "Item3"))
        println(map)
    }

    fun set() {
        val set = setOf(1, 3, 5)

        val set2 = mutableSetOf(1, 3, 5)

        println(set)
    }
}