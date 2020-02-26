## 7. Function

#### 1. Basic Function

Function are declared using the `fun` keywordm followed by a function name and any parameters.
You can also specify the return type of a function, which default to `Unit`.


~~~Kotlin
fun sayMyName(name: String){        //return type is Unit

} 

fun sayMyName(name: String): String{  //return type is String
    return "Ewan"
}
~~~

A shorthand version of the same:

~~~Kotlin
fun sayMyName(name: String): String = "Ewan"
~~~

The return type can be omitted since it can be inferred:
 
~~~Kotlin
fun sayMyName(name: String) = "Ewan" 
~~~

#### 2. Inline Function

Function can be declared inline using the `inline` prefix. They are replaced by the function's body code at compile time.
This can lead to performance benefits in some circumstances, __mainly where lambdas are used as function parameters.__

For example, When use like below Kotlin code.
~~~Kotlin
fun inlineTest(a: Int, b: Int, op: (Int, Int)-> Int) : Int{
    return op(a,b)
}

fun test(){
    val ex = inlineTest(1,2){a: Int, b: Int -> a + b}
}
~~~

Decompile above Kotlin code to Java, lambda transform `Function2` object. 
Finally in `test` method, invoke `Function2` object.
~~~Java
public final int inlineTest(int a, int b, @NotNull Function2 op) {
    Intrinsics.checkParameterIsNotNull(op, "op");
    return ((Number)op.invoke(a, b)).intValue();
}

public final void test() {
    int ex = this.inlineTest(1, 2, (Function2)null.INSTANCE);
    boolean var2 = false;
}
~~~

But if use `inline` front of method.

~~~Kotlin
inline fun inlineTest(a: Int, b: Int, op: (Int, Int)-> Int) : Int{
    return op(a,b)
}

fun test(){
    val ex = inlineTest(1,2){a: Int, b: Int -> a + b}
}
~~~

Decompile shown like below coed.

Actually, there is `Function2` method in `inlineTest` method.

But in `test` method, they include `inlineTest` body instead object invoke.

~~~Java
public final int inlineTest(int a, int b, @NotNull Function2 op) {
    int $i$f$inlineTest = 0;
    Intrinsics.checkParameterIsNotNull(op, "op");
    return ((Number)op.invoke(a, b)).intValue();
}

public final void test() {
    byte a$iv = 1;
    int b$iv = 2;
    int $i$f$inlineTest = false;
    int var8 = false;
    int ex = a$iv + b$iv;
    boolean var2 = false;
}
~~~

#### 3. Lambda Function

Lambda functions are anonymous functions which are usually created during a function call to act as a function parameter. They are declared by surrounding expressions with `{ }` - if arguments are needed, these are put before an arrow `->`.

~~~Kotlin
{name: String -> "My name is $name"}
~~~

__The last statement inside a lambda function is automatically the return value__

The type's are optional, if you put the lambda on a place where the compiler can infer the types.

Multiple arguments:

~~~Kotlin
{argumentsOne: String, argumentsTwo: String -> "$argumentsOne - $argumentsTwo"}
~~~ 

If the lambda function only needs one argument, then the argument list can be omitted and the single argument be referred to using it instead.

~~~Kotlin
{"My name is $it"}
~~~ 

If the only argument to a function is a lambda function, then parentheses can be completely omitted from the
function call.

~~~Kotlin
// These are identical
listOf(1, 2, 3, 4).map({it + 2})
listOf(1, 2, 3, 4).map {it + 2}
~~~

#### 4. Operator Function

Kotlin allows us to provide implementations for a predefined set of operators with fixed symbolic representation
(like + or *) and fixed precedence.

There are two way how to make Operator Function.

1. In class

~~~Kotlin
data class ListWrapper(val wrapped: List<Int>){
    operator fun get(position: Int): Int = wrapped[position] + 100
}

println(ListWrapper(listOf(1,2,3))[1])
~~~

2. Function extension
~~~Kotlin
data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point) = Point(x + other.x + 1, y + other.y + 1)
~~~

~~~Kotlin
val x = Point(1,1)
val x2 = Point(2,2)

println(x + x2)
~~~