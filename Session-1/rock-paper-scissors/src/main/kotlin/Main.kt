fun main(){
    val repeat: Boolean = true
    runGame(repeat)
}

fun runGame(repeat: Boolean?){
    do {
        val options = arrayOf("rock", "paper", "scissors")

        var choiceComputer = options.random()
        println("Type your choice:")
        val userChoice = readLine()

        println("Computer: $choiceComputer")

        if (choiceComputer == "rock" && userChoice == "paper"){
            println("User won!")
        } else if(choiceComputer == "rock" && userChoice == "scissors"){
            println("Computer won!")
        } else if(choiceComputer == "paper" && userChoice == "scissors"){
            println("User won!")
        } else if(choiceComputer == "paper" && userChoice == "rock"){
            println("Computer won!")
        } else if(choiceComputer == "scissors" && userChoice == "rock"){
            println("User won!")
        } else if(choiceComputer == "scissors" && userChoice == "paper"){
            println("Computer won!")
        } else if (choiceComputer == userChoice){
            println("Draw!")
        }else {
            println("No correct input")
        }

        println("Want to play again?")
        val userRepeat = readLine()
        if (userRepeat == "no"){
            repeat = !repeat
        }
    } while (repeat == true)
}