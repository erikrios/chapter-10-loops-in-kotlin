package com.erikriosetiawan

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val numberStrings = numbers.filter { it % 2 == 0 }.map { "Number $it" }

    println(numberStrings.toString())
}