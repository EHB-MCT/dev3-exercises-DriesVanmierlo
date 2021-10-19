open class Person (open val name: String) {
    fun introduce(){
        println("Hello, my name is $name")
    }

    open fun talk(){}
}