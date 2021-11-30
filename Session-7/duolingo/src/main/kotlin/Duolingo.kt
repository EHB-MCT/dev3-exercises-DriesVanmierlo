class Duolingo {
    val wordCollection: MutableList<Word>

    init {
        wordCollection = mutableListOf<Word>(
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
        )
    }

    fun play(){
        val currentWords = wordCollection.shuffled().take(5).toMutableSet()
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