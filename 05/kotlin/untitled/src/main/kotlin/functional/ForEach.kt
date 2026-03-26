package org.example.functional



fun forEachBasic() {
    cookies.forEach {
        println("Menu item: ${it.name}")
    }
}