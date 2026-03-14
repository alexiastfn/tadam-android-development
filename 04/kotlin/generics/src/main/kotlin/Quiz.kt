package org.example

class Quiz  : ProgressPrintable {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)


    // Companion Objects are singletons that belong to class, not to the instances of Quiz class
    // kind of static members from java
    // the type of this companion object is Quiz.StudentProgress2
    companion object StudentProgress2 {
        var total: Int = 10
        var answered: Int = 3
    }

    override val progressTextFromInterface: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBarFromInterface() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }


//    fun printQuiz() {
//        println(question1.questionText)
//        println(question1.answer)
//        println(question1.difficulty)
//        println()
//        println(question2.questionText)
//        println(question2.answer)
//        println(question2.difficulty)
//        println()
//        println(question3.questionText)
//        println(question3.answer)
//        println(question3.difficulty)
//        println()
//    }

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.difficulty)
            println(it.answer)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }

}

