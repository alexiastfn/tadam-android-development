package org.example.practice

fun temperatureConverter() {
    // Fill in the code
    printFinalTemperature(27.0, "Celsius", "Fahrenheit", { x -> 32 + x * 1.8})  // pass a lambda func directly to a func
    printFinalTemperature(350.0, "Kelvin", "Celsius", { x -> x - 273.15})
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", { x -> 5 * (x - 32) / 9 + 273.15})

}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}