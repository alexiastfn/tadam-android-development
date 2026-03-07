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

//