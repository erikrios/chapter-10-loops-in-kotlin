package com.erikriosetiawan

fun main() {
    val map = hashMapOf(1 to "foo", 2 to "bar", 3 to "baz")

    for ((key, value) in map) {
        println("Map[$key] = $value")
    }
}