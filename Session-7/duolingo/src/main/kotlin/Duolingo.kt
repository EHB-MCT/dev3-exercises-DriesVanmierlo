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
        var correct: Boolean = true
        var i = 0
        val currentWords = wordCollection.shuffled().take(5)
        while (i < 5 && correct == true){
            val randomWord = currentWords[i]
            val randomWordText = randomWord.original
            println(randomWordText)
            println("What is the translation?")
            val userAnswer = readLine()
            if (userAnswer == randomWord.translated){
                i++
            } else {
                correct = false
                println("Wrong answer!")
            }
        }
    }
}