package com.juniormoura.collectios

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 6
    values[2] = 7
    values[3] = 3
    values[4] = 2

    for (valor in values){
        println(valor)
    }

    println("--------------------------")

    values.forEach {
        println(it)
    }

    println("--------------------------")

    for (index in values.indices) {
        println(values[index])
    }

    println("--------------------------")

    values.sort()
    for (valor in values)
        println(valor)
}
