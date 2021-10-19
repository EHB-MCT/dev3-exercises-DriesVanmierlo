class Chatbot(override val name: String): Person(name) {
    fun talk(){
        println("Are you read to party?\n" +
                "Here we go\n" +
                "Almost heaven, West Virginia\n" +
                "Blue Ridge Mountains, Shanandoa River\n" +
                "Life is old there, older than the trees\n" +
                "Younger than the mountains, blowing like a breeze\n" +
                "Country Roads, take me home\n" +
                "To the place I belong\n" +
                "West Virginia, mounty mamma\n" +
                "Take me home, country roads\n"
                )
    }
}