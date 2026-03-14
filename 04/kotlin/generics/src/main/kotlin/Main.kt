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


    println("---------------------- extension ----------------------")
    println(Quiz.progressText)
    println()



}