class Comedian (override val name: String): Person(name), ChatPartner {
    override fun talk(){
        tellJoke()
    }

    fun tellJoke(){
        println("Can i tell you a joke? My life is a joke :)")
    }
}