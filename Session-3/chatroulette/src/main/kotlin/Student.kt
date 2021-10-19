class Student(override val name: String): Person(name) {
    fun gossip(){
        println("I heard that we all get good grades, did your hear that too?")
    }
}