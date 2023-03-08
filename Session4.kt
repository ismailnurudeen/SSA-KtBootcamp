package com.example.ktbootcamp

fun main(){
//    Session 4 (Week 2, Day 1): Functions
//        Declaring Functions
    val toyotaKey = "toyotaKey"
    val benzKey = "Benz Key"
//    startCar(benzKey)

//  Default and Named Arguments
//    startCar(oil = "pms oil")
//        Function Overloading
//    startCar()

//        Lambda Expressions
    val fuelAndOilMix = { mix: String ->

    }

    startCar(key = "Limozin", fuelType = "PMS", oil = "Forte Oil", mixer = { mix: String ->
        println(mix)
    })

    startCar(key = "Limozin", fuelType = "PMS", oil = "Forte Oil"){
        println(it)
    }

// TODO: Sample project: "Rock Paper Scissors" - Create a console game of rock paper scissors,
//  where the computer generates a random choice and the user inputs theirs.
//TODO:    Assignment: Write a program that determines if a number is prime or not.

}

fun startCar(key: String = "Kia Key", fuelType: String = "Kero",
             oil: String = "rain oil", mixer: (String) -> Unit){
    println("This is a car with key: $key, fuelType: $fuelType, oil: $oil")
    val mix = "$fuelType + $oil"
    mixer(mix)
}

//(InputType) -> returnType
//(String) -> Int












