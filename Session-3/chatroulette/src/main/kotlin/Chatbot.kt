class Chatbot(): ChatPartner {
    override fun introduce() {
        println("Hi my name is Real John Denver")
    }

    override fun talk(){
        sing()
    }

    fun sing(){
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