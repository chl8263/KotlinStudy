class ClassDelegation_ {

    fun run(){
        Eagle(Bird()).fly()
    }
}

class Eagle(fly: Fly): Fly by fly, Walk{
    override fun walk() {
        println("Eagle walk")
    }
}

class Bird(): Fly{
    override fun fly() {
        println("Bird Fly")
    }
}

interface Fly{
    fun fly()
}

interface Walk{
    fun walk()
}