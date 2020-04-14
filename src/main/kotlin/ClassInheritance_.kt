class ClassInheritance_ {
    fun run(){
//        Thing("Ewan")
//        Thing2("Ewan", "Seattle")
        val car: Car = BrokenCar("Pony")
        car.speed = 100
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

abstract class Car {
    abstract val name : String
    open var speed: Int = 0
}

class BrokenCar(override val name: String) : Car(){
    override var speed: Int
        get() = 0
        set(value){
            throw UnsupportedOperationException("This car is broken")
        }
}