fun main (){
    val sam = Person("Sam")
    val guillaume = Person("Guillaume")

    val people = arrayOf(sam, guillaume)

    people[(people.indices).random()].introduce()
}