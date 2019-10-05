fun Iteration(){
    var a= listOf<String>("Prajjawal","Prakhar","Nirmaljeet","Sajal")
    var b= listOf<String>("apple","mango","banana","peach","Cucumber")
    var c: Int=0
    for(item in a)
    {
        println(item)
    }
    while(c<a.size)
    {
        println(b[c])
        c++
    }

}
fun main() {
    var x:Int=10
    for (y in 1..x)
    {
        println("$y fits in the range of x")
    }
    Iteration()
}