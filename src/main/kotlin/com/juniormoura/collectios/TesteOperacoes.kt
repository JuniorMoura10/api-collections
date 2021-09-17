package com.juniormoura.collectios

fun main() {
    val salarios = doubleArrayOf(3000.0, 2560.0, 4000.0)
    salarios.sort()
    for (salario in salarios){
        println(salario)
    }

    println("--------------------")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salario: ${salarios.average()}")

    println("-------------------------")
    val salariosMaiorQue2500 = salarios.filter {it > 2500.0}
    salariosMaiorQue2500.forEach { println(it) }

    println("-------------------------")
    println(salarios.count { it in 2000.0..5000.0 })

    println("-------------------------")
    println(salarios.find { it == 2000.0 })
    println(salarios.find { it == 3000.0 })

    println("-------------------------")
    println(salarios.any { it == 2000.0 })
    println(salarios.any { it == 3000.0 })
}