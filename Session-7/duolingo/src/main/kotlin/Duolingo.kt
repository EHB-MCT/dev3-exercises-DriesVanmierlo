class Duolingo {
    val wordCollection = setOf<String>("tuesday", "screen", "bike", "street", "wall", "chien", "chat", "baguette", "oui", "fromage")
    val correctTranslation = setOf<String>("dinsdag", "scherm", "fiets", "straat", "muur", "hond", "kat", "stokbrood", "ja", "kaas")

    fun play(){
        var i = 0
        while (i<5){
        val randomWord: String = wordCollection.random()
        println(randomWord)
        i++
        }
    }
}