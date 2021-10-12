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
            challengeThree()
        } else {
            gameOver()
        }
        "high" -> if(randomDiceRoll > 3){
            println("Correct!")
            challengeThree()
        } else {
            gameOver()
        }
    }
}

fun challengeThree (){
    println("ROUND 3 - if you fail this round, drink 6 sips")
    println("I hope you are enjoying it so far.")
    println("Now, imagine you have an hangover from yesterday.")
    println("You are still laying in bed not feeling so well.")
    println("What are going to do to fight that evil hangover?")
    println("Are you:")
    println("1: drink nothing, otherwise it will upset your stomach.")
    println("2: drink water, this way you will be hydrated again.")
    println("3: eat a big meal to compensate the rest of the alcohol in your body.")
    println("Type the number of your next move.")

    var userAnswer: String? = readLine()

    when(userAnswer){
        "1" -> gameOver()
        "2" -> println("Idk, but I would do this :)")
        "3" -> {
            println("Not the best idea, try round 2 again and come back later!")
            challengeTwo()
        }
    }
}

fun gameOver(){
    println("GAME OVER, you need to drink!")
}

fun rollDice (): Int {
    return (0..6).random()
}