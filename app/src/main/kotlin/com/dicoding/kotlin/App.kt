/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.dicoding.kotlin

import com.dicoding.kotlinoop.Car

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun sayHello (name: String): String {
    return "Hello $name, Selamat Belajar!"
}


fun main() {

    val array = arrayOf('G','A','L','A','N','G')


    for (i in array) {
        println(i)
    }

    println(App().greeting)
    println(sayHello("Galang"))
}