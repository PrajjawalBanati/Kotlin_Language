class Dog(
        var name : String,
        var age : Int,
        var breed : String){

    fun dogInformation() =
            println("${this.name} is a ${this.breed} and is ${this.age} years old.")
}


fun main() {
    var dog = Dog("Ben", 5, "Newfoundland")
    dog.dogInformation()
}
