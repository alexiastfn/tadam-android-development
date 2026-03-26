package org.example.functional

fun mapFunctionalBasic() {

    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }


    println("Full menu new price:")
    fullMenu.forEach {
        println(it)
    }
}