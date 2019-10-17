abstract class Shape protected constructor() {

    abstract var width: Double

    abstract var height: Double

    abstract fun findArea(): Double
}

class Triangle(width: Double, height: Double) : Shape() {
    override var width = width
    override var height = height

    override fun findArea(): Double = (width * height) / 2
}

class Rectangle(width: Double, height: Double) : Shape() {
    override var width = width
    override var height = height
    override fun findArea(): Double = width * height
}


fun main(args: Array<String>) {
    val triangle = Triangle(5.0, 10.0)
    val rectangle = Rectangle(2.0, 6.0)

    println("The area of the triangle is ${triangle.findArea()}")
    println("The area of the rectangle is ${rectangle.findArea()}")
}
