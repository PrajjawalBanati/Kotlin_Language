/**
** apply and let
*/
fun main(args: Array<String>) {

    data class Person(val name: String?, var age: Int = 13)

    val john = Person("John")
    val mike = Person("Mike")

    // 'apply' has the calling object (named 'this') as input and returns 'this' reference
    val referenceToJohn = john.apply {
        val newRef = this.copy(age = 14)
        println(newRef.age)  // prints 14
    }

    println(referenceToJohn.age) // prints 13 (not 14)

    // let has the calling object (named 'it') and returns the last statement
    val nothing: Unit = john.let {

    }


    // let has the calling object (named 'it') and returns the last statement
    val one = john.let {
        1
    }
    println(one) // prints 1

    val johnsAge = john.let {
        it.age
    }
    println(johnsAge) // prints 13

}
