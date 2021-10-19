class Teacher(override val name: String): Person(name) {
    fun funFact(){
        println("Did you know that the earth is actually not flat?")
    }
}