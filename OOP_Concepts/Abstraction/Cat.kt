class Cat: Mammal() {
    override var name : String = "Cat"

    override var legs : Int = 4

    override fun makeSound() {
        println("Meow")
    }
}
