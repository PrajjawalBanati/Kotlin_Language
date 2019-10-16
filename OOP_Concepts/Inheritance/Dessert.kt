interface Dessert {
    val ingredients: Array<String>
}

//Banoffee Pie has fixed ingredients
class BanoffeePie(override val ingredients: Array<String> = arrayOf(
        "Banana", "Cream", "Toffee", "Buttery biscuit base"
)) : Dessert

//Cake could have many different ingredients depending on whether it's chocolate, Victoria, etc.
//class is open so it can be inherited from
open class Cake(override val ingredients: Array<String>, open val shape: String) : Dessert

//inherits from Cake
class ChocolateCake(override val ingredients: Array<String> = arrayOf(
        "Flour", "Egg", "Butter", "Chocolate icing", "Cocoa powder"
), override val shape: String, val mainFlavour: String = "Chocolate") : Cake(ingredients, shape)

