fun main() {

    // Immutable List
    // The content of list can not be changed after creation.
    // the type `List<String>` can be omitted since Kotlin have type Inference
    val list: List<String> = listOf("apple", "banana", "coconut")
    println(list.size) // 3

    // get by index
    println(list.get(0)) // apple
    println(list[1]) // banana

    // get first or last element
    println(list.first()) // apple
    println(list.last()) // coconut

    // check list's elements contain
    println(list.contains("coconut")) // true
    println(list.contains("strawberry")) // false

    // travers all element
    list.forEach{element ->
        println("$element") // apple banana coconut
    }
    
    // Mutable List
    // The content of list can be add/ modify after creation
    val mutableList = mutableListOf(1,2,1)
    println(mutableList) // [1,2,1]

    // add element
    mutableList.add(3)

    // remove by index
    mutableList.removeAt(0)

    // remove by value
    mutableList.remove(2)

    println(mutableList) // [1,3]
}
