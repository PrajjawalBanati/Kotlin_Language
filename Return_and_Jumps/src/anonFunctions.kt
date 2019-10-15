fun main(){
    //anon function
    val square: (Int) -> Int = {value -> value * value}
    //implimentation of anon func.
    val nine = square(3)

    val addFunction = returnAddFunction()
    val four = addFunction(2, 2)
}

//simple add function
fun add(a:Int, b: Int): Int {
    return a+b
}

//function returning a function - function signature states
// that this function takes 0 parameters and returns a function tha ttakes two Ints and returns and Int
fun returnAddFunction(): ((Int, Int) -> Int) {
    return ::add
}





