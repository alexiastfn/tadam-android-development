package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("----------------------")
    println("----------------------")
    println()
    println()
    println("---------------------- generic class Question ----------------------")
    questions()
    println()

    println("---------------------- singleton/object ---------------------- ")
    var answered = StudentProgress.answered
    var total = StudentProgress.total
    println("$answered question answered from $total")
    println()

    println("---------------------- companion object ----------------------")
    println("${Quiz.answered} of ${Quiz.total} answered.")
    println("${Quiz.StudentProgress2.answered} of ${Quiz.StudentProgress2.total} answered.")
    println()


    println("---------------------- extension property Quiz ----------------------")
    println(Quiz.progressText)
    println()

    println("---------------------- extension function Quiz ----------------------")
    Quiz.printProgressBar()     // equivalent: Quiz.StudentProgress2.printProgressBar()
    println()

    println("---------------------- extension function String ----------------------")
    println("hello".lastChar())
    println()



}