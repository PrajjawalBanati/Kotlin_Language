abstract class Mammal {

    abstract var name : String

    abstract var legs : Int

    fun howManyLegs() {
        println("The $name has $legs legs")
    }

    abstract fun makeSound()
}
