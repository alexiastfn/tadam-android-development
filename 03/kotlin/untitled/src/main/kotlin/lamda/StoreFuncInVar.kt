package org.example.lamda

fun storeFuncInVar() {

    //val trickFunction = trick
    val trickFunction = :: trick
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

