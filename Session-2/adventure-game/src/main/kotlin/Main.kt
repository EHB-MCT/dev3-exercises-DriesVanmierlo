fun main(){
    println("Welcome to the game: Lets get drunk!")
    println("Try to get to the last round, if you succeed, you can give out some shots!")
    println("But, if you fail, you have to drink twice as much as the number of the round you failed.")
    println("Good luck!")
    challengeOne()
}

fun challengeOne(){
    println("ROUND 1 - if you fail this round, drink 2 sips")
    println("Tell me, what do you think is one of my favourite, Belgian beers?")
    val correctAnswersBeers = setOf<String>("Stella Artois", "Cristal", "Cornet", "La Chouffe")
    val userAnswer = readLine()
    if(correctAnswersBeers.contains(userAnswer)){
        println("Correct! You clearly have a good taste!")
        challengeTwo()
    } else {
        gameOver()
    }
}

fun challengeTwo(){
    println("ROUND 2 - if you fail this round, drink 4 sips")
    println("Congrats, you made it to round 2!")
    println("Now you have to predict a virtual dice roll.")
    println("if you think it's gonna be 1-3, type low")
    println("if you think it's gonna be 4-6, type high")

    val randomDiceRoll = rollDice()
    println(randomDiceRoll)
    val userAnswer = readLine()

    when(userAnswer){
        "low" -> if (randomDiceRoll < 4){
            println("Correct!")
        } else {
            gameOver()
        }
        "high" -> if(randomDiceRoll > 3){
            println("Correct!")
        } else {
            gameOver()
        }
    }
}

fun gameOver(){
    println("GAME OVER, you need to drink!")
}

fun rollDice (): Int {
    return (0..6).random()
}