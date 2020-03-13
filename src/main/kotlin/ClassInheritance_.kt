class ClassInheritance_ {
    fun run(){
        Thing("Ewan")
        Thing2("Ewan", "Seattle")
    }
}

class Thing(val name: String){

}

class Thing2 (val name: String){

    init {
        println("init")
    }

    constructor(name: String, address: String) : this(name) {
        println(name)
    }

    constructor(name: String, address: String, nick: String) : this(name) {

    }
}