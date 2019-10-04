import java.util.*

fun max(a:Int,b:Int):Int{
    if(a>b)
        return a
    else if(b>a)
        return b
    else
        return 0
}
fun main() {
    val a: Int
    val b: Int
    val c: Int
    val sc=Scanner(System.`in`)
    val s1: String = "My name is Prajjawal"
    println("Enter any String")
    val s2: String= sc.nextLine()
    println(s1)
    println(s2)
    println("Enter two numbers")
    a=sc.nextInt()
    b=sc.nextInt()
    c=max(a,b)
    if(c==0)
    {
        println("Numbers are equal")
    }
    else
        println("Higher number is $c")

}