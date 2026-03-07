package org.example.lamda

fun storeFuncInVar() {

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

