class Duolingo {

    var roundSize: Int = 0
    var language: String = ""

    constructor(roundSize: Int = 5, language: String = "en") {
        println("Hoeveel woorden per ronde wil je?")
        this.roundSize = readLine()!!.toInt()

        println("Welke taal kies je? 'en' of 'fr'")
        this.language = readLine()!!
    }

    val wordCollection = mutableListOf<Word>(
            Word("tuesday", "dinsdag", "en"),
            Word("screen", "scherm", "en"),
            Word("bike", "fiets", "en"),
            Word("street", "straat", "en"),
            Word("wall", "muur", "en"),
            Word("cat", "kat", "en"),
            Word("dog", "hond", "en"),
            Word("car", "auto", "en"),
            Word("train", "trein", "en"),
            Word("cheese", "kaas", "en"),
            Word("fromage", "kaas", "fr"),
            Word("chien", "hond", "fr"),
            Word("chat", "kat", "fr"),
            Word("baguette", "stokbrood", "fr"),
            Word("oui", "ja", "fr"),
            Word("chauffage", "verwarming", "fr"),
            Word("fenetre", "venster", "fr"),
            Word("voiture", "auto", "fr"),
            Word("bouteille", "fles", "fr"),
            Word("eau", "water", "fr")
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