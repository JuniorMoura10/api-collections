package com.juniormoura.collectios

fun main() {
    val values = intArrayOf(3, 8, 4, 1, 10, 2, 7)

    values.forEach {
        println(it)
    }

    println("------------------")
    values.sort()
    values.forEach {
        println(it)
    }

}