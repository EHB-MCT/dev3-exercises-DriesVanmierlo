class Teacher(override val name: String): Person(name), ChatPartner {
    override fun talk(){
        funFact()
    }

    fun funFact(){
        println("Did you know that the earth is actually not flat?")
    }
}