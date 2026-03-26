package org.example.practice

fun main() {

    println("------")
    val eventStudy = Event("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.", Daypart.MORNING, 15)
    println(eventStudy)

    println("------")
    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("You have ${shortEvents.size} short events.")

    println("------")



}