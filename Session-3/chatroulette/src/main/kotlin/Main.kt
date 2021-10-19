fun main (){
    val chatPartners = arrayOf(Student("Sam"), Teacher("Bert"), Comedian("Mike"), Chatbot())
    val chatMatch = chatPartners.random()
    chatMatch.introduce()
    chatMatch.talk()
}