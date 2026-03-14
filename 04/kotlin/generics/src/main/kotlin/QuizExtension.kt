package org.example

// Extension Property:
// Extensions are get-only because they can't store data
// This is an extension for the companion object Quiz.StudentProgress2
val Quiz.StudentProgress2.progressText: String
    get() = "${answered} of ${total} answered"


// Extension function:

fun Quiz.StudentProgress2.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressText)
}