// function with arguments.
fun sum(a: Int, b: Int): Int {
  return a + b
}

// function with expression body
// Because of Type inference, the return type declaration can be omitted.
fun volume(height: Int, width: Int, depth: Int) = height * width * depth

// function with default argument value
// and non-returnable (Unit).
fun greetings(greet: String, times: Int = 3): Unit {
    (1..times).forEach {
        println(greet)
    }
}

// Function with lambda as last argument (Higher order function)
// the lambda is receive first argument as input and Unit/void as output.
fun sayHi(name: String, process: (String) -> Unit): Unit {
    process.invoke(name)
}

fun main() {

  // function call with arguments
  println(sum(2,3)) // 5

  // function call with named arguments
  println(volume(
      height = 2,
      width  = 3,
      depth  = 4
  )) // 24

  // function call with default arguments
  greetings("Hello") // Hello, 3 times

  // If last argument of function is lambda
  // can be use curly braces instead.
  sayHi("Max") { name ->
      println("Hello, Aloha, Hi.. $name") // Hello, Aloha, Hi.. Max
  }
}

