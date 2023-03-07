package com.example.ktbootcamp

fun main(){
//  TODO Sample project: "Simple Calculator" -
//      Create a console application that prompts the user for
//      two numbers and performs a simple arithmetic operation
//      (addition, subtraction, multiplication, or division) on them.

      print("Enter your first number: ")
    val number1 = readln().toDouble()

    print("Enter your second number: ")
    val number2 = readln().toDouble()

    val sum: Double = number1 + number2
    println("SUM: ${sum.toInt()}")

    val subtraction: Double = number1 - number2
    println("SUBTRACTION: $subtraction")

    val multiplication: Double = number1 * number2
    println("MULTIPLICATION: $multiplication")

    val division: Double = number1 / number2
    println("DIVISION: $division")

    val remainder: Double = number1 % number2
    println("REMAINDER: $remainder")
}
