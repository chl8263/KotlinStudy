class Enum_ {
    enum class Color (val rgb: Int){
        RED(0xFF000),
        GREEN(0x00FF00),
        BLUE(0x0000FF)
    }

    enum class Color2{
        RED, GREEN, BLUE
    }

    enum class Color3(var x : Int = 0){
        EARTH(7 * 10000),
        MARS();

        override fun toString(): String = "$name [x = $x]"
    }

    constructor(){
        var a = Color.RED
        println(a.rgb)

        var b = Color2.GREEN
        println(b.name)

        var c = Color3.MARS
        println(c)
        c.x = 1234
        println(c)
    }

    fun run() {

    }
}