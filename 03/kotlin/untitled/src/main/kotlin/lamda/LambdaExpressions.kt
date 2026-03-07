package org.example.lamda

// ---------------------------------------
// Omit parameter name

fun parameterIt() {

//    val coins: (Int) -> String = {
//        quantity -> "$quantity quarters"
//    }

    val coins: (Int) -> String = {
        "$it quarters"
    }

    val treatFunction = trickOrTreat3(false, coins)
    val trickFunction = trickOrTreat3(true, null)
    treatFunction()
    trickFunction()
}


// ---------------------------------------
// Pass a lambda expression directly into a function

fun lambdaExprInFunc() {

    val treatFunction = trickOrTreat3(false, {"$it coins"})
    val trickFunction = trickOrTreat3(true, null)
    treatFunction()
    trickFunction()
}

