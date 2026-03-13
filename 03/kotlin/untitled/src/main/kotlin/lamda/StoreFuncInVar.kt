package org.example.lamda

fun storeFuncInVar() {

    val trickFunction = trick       // for lambda
    //val trickFunction = :: trick  // for a func
    trick()
    trickFunction()
    treat()


}

// lambda expression
// vars that store functions = var care contine o functie
val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}

