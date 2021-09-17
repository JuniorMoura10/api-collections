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

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0}
    println("-------------------------")

    salariosMaiorQue2500.forEach { println(it) }
}