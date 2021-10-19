fun main (){
    val sam = Student("Sam")
    val guillaume = Teacher("Guillaume")
    val matthias = Comedian("Matthias")
    val chatbot = Chatbot("Real John Denver")

    val people = arrayOf(sam, guillaume, matthias, chatbot)

    val personIndex = (people.indices).random()
    val person = people[personIndex]

    people[personIndex].introduce()

    when(person){
        sam -> sam.gossip()
        guillaume -> guillaume.funFact()
        matthias -> matthias.tellJoke()
        chatbot -> chatbot.talk()
    }
}