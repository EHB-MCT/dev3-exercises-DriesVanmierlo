fun main (){
    val sam = Student("Sam")
    val guillaume = Teacher("Guillaume")
    val matthias = Comedian("Matthias")

    val people = arrayOf(sam, guillaume, matthias)

    val personIndex = (people.indices).random()
    val person = people[personIndex]

    people[personIndex].introduce()

    when(person){
        sam -> sam.gossip()
        guillaume -> guillaume.funFact()
        matthias -> matthias.tellJoke()
    }
}