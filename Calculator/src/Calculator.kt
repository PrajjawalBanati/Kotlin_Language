import java.util.*

fun sum(a: Double, b: Double): Double{
    return a+b
}
fun subtraction(a: Double,b: Double): Double{
    return a-b
}
fun multiplication(a: Double,b: Double): Double {
    return a*b
}
fun divide(a: Double,b: Double): Double{
    return a/b;
}
fun main()
{
    // Integer c declaration
    val c: Double
    val d: Double
    //Initializing read object of Scanner Type
    val read=Scanner(System.`in`)
    println("Enter two numbers")
    c=read.nextDouble()
    d=read.nextDouble()
    println("Sum of $c and $d is "+sum(c,d))
    println("Difference of $c and $d is "+subtraction(c,d))
    println("Product of $c and $d is "+multiplication(c,d))
    println("Quotient of $c and $d is "+divide(c,d))

}