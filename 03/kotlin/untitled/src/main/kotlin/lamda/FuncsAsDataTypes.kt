package org.example.lamda

// function as a return type

fun trickOrTreat1(isTrick: Boolean): () -> Unit {
    if (isTrick) {
        return trick1
    } else {
        return treat1
    }
}

val trick1 = {
    println("No treats!")
}

val treat1 = {
    println("Have a treat!")
}

fun funAsReturnType() {
    val treatFunction = trickOrTreat1(false)
    val trickFunction = trickOrTreat1(true)
    treatFunction()
    trickFunction()
}

// function to another function as an argument

fun trickOrTreat2(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        println(extraTreat(5))
        return treat
    }
}

fun funAsArgument() {

    val coins: (Int) -> String = {
        x -> "$x quantity"
    }

    val cupcake: (Int) -> String = {
        "Have a cupcake! <3"
    }

    val treatFunction = trickOrTreat2(false, coins)
    val trickFunction = trickOrTreat2(true, cupcake)
    treatFunction()
    trickFunction()
}

