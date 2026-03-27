package org.example.practice

fun main() {

    println("------")
    val eventStudy = Event("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.", Daypart.MORNING, 15)
    println(eventStudy)

    // Task 2
    // Daypart Enum

    // Task 3
    // val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)

    println("------ Task 4")
    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("You have ${shortEvents.size} short events.")

    println("------ Task 5")
    val groupedEvents = events.groupBy { it.daypart }
    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }

    println("------ Task 6")
    println("Last event of the day: ${events[events.size - 1].title}")
    println("Last event of the day: ${events.last().title}")

    println("-------- Task 7")
    println(events[0].durationOfEvent)
    println(events[1].durationOfEvent)
    println(events[5].durationOfEvent)





}