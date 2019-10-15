fun main() {

    // Immutable Set
    // The content of set can not be changed after creation.
    // the type `Set<String>` can be omitted since Kotlin have type Inference
    val set: Set<String> = setOf("apple", "banana", "coconut","apple")
    println(set.size) // 3
    println(set) // [apple,banana,coconut]

    // get first or last element
    println(set.first()) // apple
    println(set.last()) // coconut

    // check list's elements contain
    println(set.contains("coconut")) // true
    println(set.contains("strawberry")) // false

    // travers all element
    set.forEach{ element ->
        println("$element") // apple banana coconut
    }

    // Mutable Set
    // the content of set can be add or modify after creation
    val mutableSet = mutableSetOf(1,2,3,2)
    println(mutableSet) // [1,2,3]

    // add exist element
    mutableSet.add(3) // will be omitted

    // add element
    mutableSet.add(5)

    println(mutableSet) // [1,2,3,5]

    // remove element by value
    mutableSet.remove(2)

    println(mutableSet) // [1,3,5]
}
