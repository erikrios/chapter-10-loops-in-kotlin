package com.erikriosetiawan

fun main() {
    println(factorial(10))
}

fun factorial(n: Long): Long = if (n == 0L) 1 else n * factorial(n - 1)