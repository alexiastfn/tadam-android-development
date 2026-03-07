package org.example.practice

fun main() {
    println("---------------- mobileNotification: ")
    mobileNotification()

    println("---------------- movieTicketPrice: ")
    movieTicketPrice()

    println("---------------- temperatureConverter: ")
    temperatureConverter()

    println("---------------- Song: ")
    val song = Song("La Isla Bonita", "Madonna", 1987,1114985992)
    song.print()

    println("---------------- internetFunc: ")
    internetFunc()


    println("---------------- FoldablePhone: ")
    val myPhone = FoldablePhone()

    println("Phone starts folded: ${myPhone.isFolded}")
    myPhone.checkPhoneScreenLight()

    myPhone.switchOn()
    myPhone.checkPhoneScreenLight()

    myPhone.unfold()
    println("Phone unfolded: ${myPhone.isFolded}")

    myPhone.switchOn()
    myPhone.checkPhoneScreenLight()

    myPhone.fold()
    println("Phone folded: ${myPhone.isFolded}")
    myPhone.checkPhoneScreenLight()
}