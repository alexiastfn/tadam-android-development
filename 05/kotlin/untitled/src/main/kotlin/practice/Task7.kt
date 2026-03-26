package org.example.practice

//val durationOfEvent = if (events[0].durationInMinutes < 60) {
//    "short"
//} else {
//    "long"
//}
//println("Duration of first event of the day: $durationOfEvent")



// extension property
val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }

