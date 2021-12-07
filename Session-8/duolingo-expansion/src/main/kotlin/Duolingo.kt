class Duolingo {

    var roundSize: Int = 0
    var language: String = ""
    var difficulty: String = ""

    constructor(roundSize: Int = 5, language: String = "en") {
        println("Hoeveel woorden per ronde wil je?")
        this.roundSize = readLine()!!.toInt()

        println("Welke taal kies je? 'en' of 'fr'")
        this.language = readLine()!!
    }

    val wordCollection = mutableListOf<Word>(
            EnglishWord("tuesday", "dinsdag"),
            EnglishWord("screen", "scherm"),
            EnglishWord("bike", "fiets"),
            EnglishWord("street", "straat"),
            EnglishWord("wall", "muur"),
            EnglishWord("cat", "kat"),
            EnglishWord("dog", "hond"),
            EnglishWord("car", "auto"),
            EnglishWord("train", "trein"),
            EnglishWord("cheese", "kaas"),
            FrenchWord("fromage", "kaas"),
            FrenchWord("chien", "hond"),
            FrenchWord("chat", "kat"),
            FrenchWord("baguette", "stokbrood"),
            FrenchWord("oui", "ja"),
            FrenchWord("chauffage", "verwarming"),
            FrenchWord("fenetre", "venster"),
            FrenchWord("voiture", "auto"),
            FrenchWord("bouteille", "fles"),
            FrenchWord("eau", "water")
        )

    fun play(){
        var currentWords = wordCollection.filter { it.language == this.language }.toMutableSet()
        currentWords = currentWords.shuffled().take(this.roundSize).toMutableSet()
        println(currentWords.count())

        while (currentWords.isNotEmpty()){
            val selectedWord = currentWords.random()
            println("Wat is de vertaling van: ${selectedWord.original}")
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