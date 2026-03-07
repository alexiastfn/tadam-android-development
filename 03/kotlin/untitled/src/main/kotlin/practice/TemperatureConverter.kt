package org.example.practice

fun temperatureConverter() {

    printFinalTemperature(27.0, "Celsius", "Fahrenheit", { x -> 32 + x * 1.8})
    printFinalTemperature(350.0, "Kelvin", "Celsius", { x -> x - 273.15})
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", { x -> 5 * (x - 32) / 9 + 273.15})


}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}