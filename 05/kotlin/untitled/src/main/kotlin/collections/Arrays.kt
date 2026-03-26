package org.example.collections


fun planets(): Array<String> {

    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets

    return solarSystem

}


fun modifyPlanets(solarSystem: Array<String>): Array<String> {

    solarSystem[3] = "Little Earth"
    println(solarSystem[3])

    return solarSystem

}




