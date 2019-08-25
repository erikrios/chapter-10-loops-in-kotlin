package com.erikriosetiawan

fun main() {
    val list = listOf("Hello, ", "World", "!")
    for (str in list) {
        print(str)
    }

    println()

    for (i in 0..9) {
        println(i)
    }
    for ((index, element) in list.withIndex()) {
        println("$element in index $index")
    }

    list.forEach {
        print(it)
    }
}