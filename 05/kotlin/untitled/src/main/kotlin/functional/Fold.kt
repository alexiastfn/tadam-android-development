package org.example.functional

fun foldBasic() {

    // 0.0 is the initial value
    // total is the accumulator and has 0.0 init value

    // total = 0
    // total += cookie.price
    val totalPrice = cookies.fold(0.0) {total, cookie ->
        total + cookie.price
    }

    println("Total price: $${totalPrice}")

}