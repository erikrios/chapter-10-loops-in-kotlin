package com.erikriosetiawan

fun main() {
    var i = 0
    while (i in 0..9) {
        i++
        if (i == 7) continue
        if (i > 8) break
        println(i)
    }
}