package org.example

//class FillInTheBlankQuestion(
//    val questionText: String,
//    val answer: String,
//    val difficulty: String
//)

//class NumericQuestion(
//    val questionText: String,
//    val answer: Int,
//    val difficulty: String
//)

//class NumericQuestion(
//    val questionText: String,
//    val answer: Int,
//    val difficulty: String
//)

// When you want a property to have differing data types, subclassing is not the answer
// Generic Types allow you to have a single property that can have differing data types


class Question<T> (val questionText: String, val answer: T, val difficulty: Difficulty) {

}

fun questions() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
}