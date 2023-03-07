package com.example.ktbootcamp

fun main(){
// Session 3 (Week 1, Day 3): Operators and Expressions, Control Flow
    val a = 5
    val b = 6

//        Arithmetic Operators
    println("SUM: ${a + b}")
    println("SUB: ${a - b}")
    println("MUL: ${a * b}")
    println("DIV ${a / b}")
    println("MOD: ${a % b}")

println("__________________________")

//        Comparison Operators
    println("GT: ${a > b}")
    println("LT: ${a < b}")
    println("EQT: ${a == b}")
    println("NEQT: ${a != b}")
    println("GTOREQT: ${a >= b}")
    println("LTOREQT: ${a <= b}")

    println("___________Logical Operators_______________")

//        Logical Operators
//    && (AND) || (OR)
    val areLessThanFive = (a <= 5) && (b < 5)
    val oneIsEqualToFive = (a == 5) || (b == 5)

    println("BOTH LT 5: $areLessThanFive")
    println("ONE EQT 5: $oneIsEqualToFive")

//        If-else statements
    println("___________If-else statements_______________")
//    print("Enter age: ")
//    val userAge = readln().toInt()
//
//    if(userAge > 18) println("YOU CAN VOTE!")
//    else if(userAge == 18) println("YOU'RE 18, YOU CAN VOTE!")
//    else println("YOU CANNOT VOTE! :)")

//        Ternary Operator
      val greater =  if(a > b) "a is great" else "b is great"
      println(greater)
//        Elvis Operator ( ?: )
    var emailAddress: String? = null
    emailAddress = "ade@outlook.com"

    val defaultEmail = emailAddress ?: "me@gmail.com"

    val message = "I'm am sending this note to $defaultEmail"
    println(message)

//        When expression
//print("Enter your age: ")
//val userAge = readln().toInt()

//    when(userAge){
//        18 -> {
//            println("YOU'RE 18, YOU CAN VOTE!")
//        }
//        20 -> {
//            println("YOU CAN VOTE!")
//        }
//        17 -> {
//            println("YOU CAN'T VOTE!")
//        }
//        else -> {
//            println("WE don't know your status")
//        }
//    }

//    when{
//        userAge == 18 -> println("YOU'RE 18, YOU CAN VOTE!")
//        userAge > 18 -> println("YOU CAN VOTE!")
//        userAge < 18 -> println("YOU CAN'T VOTE!")
//    }

//    val userMsg = when {
//        userAge == 18 -> "YOU'RE 18, YOU CAN VOTE!"
//        userAge > 18 -> "YOU CAN VOTE!"
//        userAge < 18 -> "YOU CAN'T VOTE!"
//        else -> ""
//    }

//    println(userMsg)







// Loops (for, while, do-while)
    for (num in 0..10){
        println(num)
    }
    println("UNTIL------------")
    for (num in 0 until 10) println(num)

    var i = 0
//    while (i < 5){
//        println("$i less than 5")
//        i++
//    }

//   do{
//       println("$i less than 5")
//       i++
//    } while (i < 6)



//       TODO: Sample project: "Guess the Number" - Create a console game where the computer
//        generates a random number between 1 and 100 and the user has to guess it.
//        The computer should give hints (higher or lower) until the user guesses the correct number.

//        TODO: Assignment: Write a program that prints the Fibonacci sequence up to a given number

}
