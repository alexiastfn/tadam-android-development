package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("----------------------")
    println("----------------------")

    questions()

    println("----------------------")
    var answered = StudentProgress.answered
    var total = StudentProgress.total
    println("$answered question answered from $total")

    println("----------------------")
    println("${Quiz.answered} of ${Quiz.total} answered.")
    println("${Quiz.StudentProgress2.answered} of ${Quiz.StudentProgress2.total} answered.")



}