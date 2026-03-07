package org.example.lamda

fun repeatFunction() {
    val treatFunction = trickOrTreat3(false, {"$it coins"})
    val trickFunction = trickOrTreat3(true, null)


    repeat(4) {
        treatFunction()
    }
    trickFunction()
}