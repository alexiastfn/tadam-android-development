package org.example.lamda

// Use functions as data types

fun main() {

    val trickFunction = trick
    trick()
    trickFunction()
    treat()


}

// lambda expression
// vars that store functions
val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}