
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
class box constructor(length: Int,breadth: Int){
    private var length:Int
    private var breadth:Int
    //The primary constructor cannot contain any code. Initialization code can be placed in initializer
    //blocks, which are prefixed with the init keyword.
    init{
        this.length=length
        this.breadth=breadth
        println("Area of the box is "+(this.length*this.breadth))
    }

}

fun main(args: Array<String>){
    var person = Person("Jalal","Khademi")
    var obj=box(23,34)
}
