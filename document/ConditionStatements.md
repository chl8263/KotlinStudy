## 8. ConditionStatements

#### 1. When-statement argument matching

When given an argument, the __when__-statement matches the argument against the branches in sequence. The
matching is done using the == operator which performs null checks and compares the operands using the equals
function. The first matching one will be executed.


~~~Kotlin
when (x) {
 "English" -> print("How are you?")
 "German" -> print("Wie geht es dir?")
 else -> print("I don't know that language yet :(")
}
~~~

The when statement also knows some more advanced matching options:

~~~Kotlin
val names = listOf("John", "Sarah", "Tim", "Maggie")
when (x) {
 in names -> print("I know that name!")
 !in 1..10 -> print("Argument was not in the range from 1 to 10")
 is String -> print(x.length) // Due to smart casting, you can use String-functions here
}
~~~

#### 2. When-statement as expression

Like if, when can also be used as an expression:

~~~Kotlin
val greeting = when (x) {
 "English" -> "How are you?"
 "German" -> "Wie geht es dir?"
 else -> "I don't know that language yet :("
}
~~~

#### 3. When-statement instead of if-else-if chains

The when-statement is an alternative to an if-statement with multiple else-if-branches:


~~~Kotlin
when {
 str.length == 0 -> print("The string is empty!")
 str.length > 5 -> print("The string is short!")
 else -> print("The string is long!")
}
~~~

Same code written using an if-else-if chain:


~~~Kotlin
if (str.length == 0) {
 print("The string is empty!")
} else if (str.length > 5) {
 print("The string is short!")
} else {
 print("The string is long!")
}
~~~

Just like with the if-statement, the else-branch is optional, and you can add as many or as few branches as you like.
You can also have multiline-branches:

~~~Kotlin
when {
 condition -> {
 doSomething()
 doSomeMore()
 }
 else -> doSomethingElse()
}
~~~