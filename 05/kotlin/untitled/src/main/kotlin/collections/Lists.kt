package org.example.collections

fun listsBasic() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)

    println(solarSystem[2])
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))



    for (planet in solarSystem) {
        print("$planet ")
    }
    println()
}

fun listsBasic2() {

    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.add("Pluto")
    solarSystem.add(3, "Theia")

    solarSystem[3] = "Future Moon"
    println(solarSystem[3])
    println(solarSystem[9])

    solarSystem.removeAt(9)
    println(solarSystem.contains("Pluto"))

}

