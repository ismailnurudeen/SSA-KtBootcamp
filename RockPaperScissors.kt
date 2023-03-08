package com.example.ktbootcamp

import kotlin.random.Random

// TODO: Sample project: "Rock Paper Scissors" - Create a console game of rock paper scissors,
//  where the computer generates a random choice and the user inputs theirs.

fun main(){
    val choices: Array<String> = arrayOf("rock", "paper", "scissors")

    while (true) {
        //TODO: Generate random guess for computer between rock, paper and scissors.
        val computerChoice: String = generateComputerGuess(choices)

        //TODO: Allow user to enter their input between rock, paper and scissors.
        print("rock, paper, scissors: ")
        val userInput = readlnOrNull()
        val userChoice = userInput?.lowercase()

        if (userChoice == null || userChoice !in choices) {
            println("Invalid input: enter between rock, paper and scissors")
            return
        }

        //TODO: Check if user wins or computer wins or if it's a tie
        val result = getResult(userChoice, computerChoice) { user, computer ->
            println("The computer played $computer and you played $user")
        }

        println(result)

        //TODO: Allow user play again
        print("Would you like to play again? (Y/N):")
        val replay = readlnOrNull()
        if (replay == "N"){
            println("Thank you for playing rock, paper, scissors with me :)")
            break
        }
    }
}

fun generateComputerGuess(choices: Array<String>): String{
    val random = Random.nextInt(until = choices.size)
    return choices[random]
}

fun getResult(userChoice: String, computerChoice: String, printBothChoices:(String, String) -> Unit): String {
    val outcome =  when{
        userChoice == computerChoice -> "It's a tie"

        (userChoice == "paper" && computerChoice == "rock") ||
            (userChoice == "scissors" && computerChoice == "paper") ||
            (userChoice == "rock" && computerChoice == "scissors") -> "You win!"

        else -> "Computer wins!"
    }
    printBothChoices(userChoice, computerChoice)
    return outcome
}














