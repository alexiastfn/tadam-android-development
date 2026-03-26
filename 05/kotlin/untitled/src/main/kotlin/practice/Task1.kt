package org.example.practice

data class Event(val title: String, val description: String? = null, val daypart: Daypart, val durationInMinutes: Int)


