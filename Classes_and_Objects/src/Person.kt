import java.util.*

class Person(name: String){
    //Initializer Block
    init{
        println("First Initializer block says name is $name")
    }
    // A simple Function Defination
    fun providename(name: String){
        println("Function ProvideName prints name as $name")
    }

}
fun main() {
    //Object declaration
    val obj= Person("keshav")
    var name: String
    val sc=Scanner(System.`in`)
    //Passing name in the function called by the object
    obj.providename("Prajjawal")
    //Taking input from the user
    println("Enter the name to display")
    name=sc.nextLine()
    //First will print Ishaan then name that user will enter as first call is for init
    val obj1= Person("Ishaan")
    obj1.providename(name)

}