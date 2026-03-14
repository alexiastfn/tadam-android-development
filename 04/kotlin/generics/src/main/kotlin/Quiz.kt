package org.example

class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)


    // Companion Objects are singletons that belong to class, not to the instances of Quiz class
    // kind of static members from java
    companion object StudentProgress2 {
        var total: Int = 10
        var answered: Int = 3
    }

}

