package com.example.ktbootcamp

fun main(){
    //Session 2 (Week 1, Day 2): Variables and Data Types

    //Variables and Constants

    val firstName = ""

    var lastName = "Ade"
//    println(lastName)

    lastName = "adam"
//    println(lastName)

    lateinit var middleName: String

    //Primitive Data Types
    var balance : Int = 3
    var accountName: String = "Mike"
    var checkingBalance: Double = 1.5
    var newBalance: Float = 1.6f
    var isNewUser: Boolean = true

    //Type Inference
    var isSavingsAccount = false
    val password = "hdvhefhledlfgvdk"

    // Null Safety
   var address: String? = null

//    println("My address is: ${address}")

//    address = "No1 ade street"

//    println("My address is: ${address}")

    var addressNo: String = address?.substring(0, 3) ?: "No2"

    println("My Address No: $addressNo")


//  TODO Sample project: "Simple Calculator" -
//      Create a console application that prompts the user for
//      two numbers and performs a simple arithmetic operation
//      (addition, subtraction, multiplication, or division) on them.


//  TODO: Assignment: Create a program that calculates the area of a circle.
//   Prompt the user for the radius and display the result.
}
