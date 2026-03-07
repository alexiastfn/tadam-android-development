package org.example.practice

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true): Phone() {



    override fun switchOn() {
        if (isFolded) {
            super.switchOn()
        } else {
            println("Cannot turn on screen - phone is folded.")
        }
    }

    override fun switchOff() {
        super.switchOff()
        println("Screen turned off.")
    }

    fun fold() {
        isFolded = true
        switchOff()
    }

    fun unfold() {
        isFolded = false
    }

}