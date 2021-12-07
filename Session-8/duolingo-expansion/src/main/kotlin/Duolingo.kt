class Duolingo {

    var roundSize: Int = 0
    var language: String = ""
    var difficulty: String = ""

    constructor(roundSize: Int = 5, language: String = "en") {
        println("typ 'custom' om zelf waarden in te stellen, typ 'moeilijkheid' om een moeilijkheid te selecteren.")
        val userAnswer = readLine()

        if (userAnswer == "custom"){
            println("Hoeveel woorden per ronde wil je?")
            this.roundSize = readLine()!!.toInt()

            println("Welke taal kies je? 'en' of 'fr'")
            this.language = readLine()!!
        } else if (userAnswer == "moeilijkheid"){
            println("'easy' of 'hard'")
            this.difficulty = readLine()!!
            if (this.difficulty == "easy"){
                this.roundSize = 3
                this.language = "fr"
            }else if (this.difficulty == "hard"){
                this.roundSize = 6
                this.language = "en"
            } else {
                throw Exception ("Selecteer een juiste moeilijkheid")
            }
        }
    }

    var wordCollection = mutableListOf<Word>(
            EnglishWord("tuesday", "dinsdag", 2),
            EnglishWord("screen", "scherm", 2),
            EnglishWord("bike", "fiets", 2),
            EnglishWord("street", "straat", 2),
            EnglishWord("wall", "muur", 1),
            EnglishWord("cat", "kat", 1),
            EnglishWord("dog", "hond", 1),
            EnglishWord("car", "auto", 1),
            EnglishWord("train", "trein", 1),
            EnglishWord("cheese", "kaas", 2),
            FrenchWord("fromage", "kaas", 2),
            FrenchWord("chien", "hond", 1),
            FrenchWord("chat", "kat", 1),
            FrenchWord("baguette", "stokbrood", 2),
            FrenchWord("oui", "ja", 1),
            FrenchWord("chauffage", "verwarming", 2),
            FrenchWord("fenetre", "venster", 2),
            FrenchWord("voiture", "auto", 1),
            FrenchWord("bouteille", "fles", 2),
            FrenchWord("eau", "water", 1)
        )

    fun play(){
        var currentWords = wordCollection.filter { it.language == this.language }.toMutableSet()
        currentWords = currentWords.shuffled().take(this.roundSize).toMutableSet()
        println(currentWords.count())

        while (currentWords.isNotEmpty()){
            val selectedWord = currentWords.random()
            println("Wat is de vertaling van: ${selectedWord.original}")
            println("moeilijkheid: ${selectedWord.difficulty}")
            val userAnswer = readLine()

            if (userAnswer != selectedWord.translated) {
                println("Helaas niet correct, probeer later opnieuw")
                currentWords.shuffled()
            } else {
                currentWords.remove(selectedWord)
            }
        }
        println("Goed gedaan! Je hebt alle woorden vertaald")
    }
}