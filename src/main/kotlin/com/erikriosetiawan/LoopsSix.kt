package com.erikriosetiawan

fun main() {
    var i = 0
    while (i in 0..10) {
        println(i)
        i++
    }

    var n = 0
    do {
        println("Iterable in $n")
        n++
    } while (n < 0)
}