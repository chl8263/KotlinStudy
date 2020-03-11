class BasicLambda_ {

    fun run(){

        val userA = arrayOf(1,2,3,4)

        val allowedUsersA = userA.filter { x ->  x > 2}

        println(allowedUsersA)

        val user = listOf(1,2,3,4)

        val allowedUsers = user.filter { x ->  x > 2}

        println(allowedUsers)

        val isOfAllowedAge = { a: Int -> a > 2}

        val allowedUsers2 = user.filter(isOfAllowedAge)

        println(allowedUsers2)
    }
}