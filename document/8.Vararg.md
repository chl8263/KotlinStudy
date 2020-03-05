## 8. Vararg

#### 1. Using the vararg keyword
Define the function using vararg keyword.

~~~Kotlin
fun printNumbers(vararg numbers: Int){
    for(number in numbers){
        println(number)
    }
}
~~~

Now you can pass as many parameters into the function as you want.

~~~Kotlin
printNumbers(0, 1, 2)
printNumbers(10, 11, 12)
~~~

#### 2. Spread Operator

Arrays can be passed into vararg function using the Spread Operator, *.

Assuming the following function exists..

~~~Kotlin
fun printNumbers(vararg numbers: Int){
    for(number in numbers){
        println(number)
    }
}
~~~

you can __pass an array__ into the function like so...

~~~Kotlin
val numbers = intArrayOf(1, 2, 3)
printNumbers(10, 20, *numbers, 30, 40)
~~~

~~~Kotlin

~~~