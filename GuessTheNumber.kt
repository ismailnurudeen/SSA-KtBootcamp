package com.example.ktbootcamp
import kotlin.random.Random
import kotlin.random.nextInt

fun main(){
//        TODO: Sample project: "Guess the Number" - Create a console game where the computer
//         generates a random number between 1 and 100 and the user has to guess it.
//         The computer should give hints (higher or lower) until the user guesses the correct number.


    // Generate Random Number between 1 and 100
    val luckyNumber = Random.nextInt(1..10)
    guessNumber(luckyNumber)

}

fun guessNumber(luckyNumber: Int){
    var userIsNotCorrect = true
    var trials = 0

    do {
        trials ++
        userIsNotCorrect = trials < 3
        // Get User Input and assign to variable
        print("Guess a number between 1 and 100: ")
        val guess = readln().toIntOrNull()

        if (guess == null) {
            println("You must enter a number")
            return
        }

        // Check if user input is higher or lower than the random number
        // If user is correct, print a congratulatory message

        //  else show user hint and allow them input another value

        when {
            (guess < 1 || guess > 100) -> {
                println("Number must be between 1 and 100")
            }
            guess == luckyNumber -> {
                println("CONGRATULATION, You won the Lotto!!!")
                userIsNotCorrect = false
            }

            guess < luckyNumber -> {
                println("Try a higher number")
            }

            guess > luckyNumber -> println("Try a lower number")
        }
    }while (userIsNotCorrect)
}
