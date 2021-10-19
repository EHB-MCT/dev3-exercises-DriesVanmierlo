class Comedian (override val name: String): Person(name) {
    fun tellJoke(){
        println("Can i tell you a joke? My life is a joke :)")
    }
}