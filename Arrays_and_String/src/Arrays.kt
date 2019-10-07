import java.util.*

fun main(){
    //Primitive Arrays
    val x= intArrayOf(1,2,3,4,5)
    val y= charArrayOf('a','b','c','d')
    for(i in 0..(x.size-1))
    {
        println(x.get(i))
    }
    for(i in 0..(y.size-1))
    {
        println(y.get(i))
    }
    //Primitive Arrays Ends
    var n:Int
    var m:Int
    var i:Int=0
    var l:String
    //Array in Kotlin by taking size from the user
    //(Starts here)
    val scan= Scanner(System.`in`)
    println("Enter the sie of the array")
    n=scan.nextInt()
    println("making array of size $n")
    //var a=Array<Datatype>(size){"" in case of strings and 0 in case of integers(basically initializing the array)}
    var a=Array<Int>(n){0}
    var b=Array<String>(n){""}
    println("Insert the elements")
    for(i in 0..(a.size-1))
    {
        m=scan.nextInt()
        a.set(i,m)
    }
    for(i in a)
    {
        println(i)
    }
    for(i in 0..(b.size-1))
    {
        l = scan.nextLine()
        b.set(i,l)
    }
    for(i in b)
    {
        println(i)
    }
    //(Ends Here)





}