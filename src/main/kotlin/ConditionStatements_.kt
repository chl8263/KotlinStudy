class ConditionStatements_ {

    fun run(){
        val x = "english"
        when(x){
            "english" -> print("How are you?")
            "German" -> print("Wie geth es dir?")
            else -> print("I don't know that language yet :(")
        }

//        val names = listOf("JOhn", "Sarah", "Tim", "Maggie")
//        when(names){
//            in names -> print("I know that name")
//            !in 1..10 -> print("Argument was not in the range from 1 to 10")
//            is String -> print(x.length)
//        }

        val greeting = when(x){
            "english" -> print("How are you?")
            "German" -> print("Wie geth es dir?")
            else -> print("I don't know that language yet :(")
        }
    }

}