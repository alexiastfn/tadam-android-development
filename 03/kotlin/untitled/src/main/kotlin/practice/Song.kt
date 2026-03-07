package org.example.practice

import com.sun.org.apache.xpath.internal.operations.Bool
import java.security.KeyStore

class Song (val title: String, val artist: String, val year: Int, val playCount: Int) {

    val isPopular: Boolean
        get() = playCount > 1000


    fun print() {
        println("$title, performed by $artist, was released in $year.")
    }

}