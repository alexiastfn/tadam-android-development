package org.example.practice

fun internetFunc() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        // Fill in code

        println("Name: $name")
        println("Age: $age")
        var lastPrint = "Likes to $hobby. "

        if (referrer == null) {
            lastPrint += "Doesn't have a referrer."
        } else {
            lastPrint += "Has a referrer named $referrer, who likes to ${referrer.hobby}"
        }


        println(lastPrint)
        println()
    }


}