
class Person(firstName: String){

    var lastName = "notSetYet"

    // init function is running for primary constructor
    init {
        println("Primary constructor: first name is $firstName and last name is $lastName")
    }

    // secondary constructor contains implementation
    constructor(firstName: String, lastName: String): this(firstName){
        this.lastName = lastName
        println("Secondary constructor: first name is $firstName and last name is $lastName")
    }
}

fun main(args: Array<String>){
    var person = Person("Jalal","Khademi")
}