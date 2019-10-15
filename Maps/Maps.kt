fun main() {

    // Immutable Map
    // The content of map can not be changed after creation.
    // the type `Map<String, Int>` can be omitted since Kotlin have type Inference
    val map: Map<String,Int> = mapOf(
        "apple" to 10,
        "banana" to 20
    )
    println(map.size) // 2
    println(map) // {apple=10,banana=20}

    // get value by key
    println(map.get("apple")) // 10
    println(map["banana"]) // 20

    // check map contains key or value
    println(map.containsKey("apple")) // true
    println(map.containsValue(50)) // false

    // travers all elements
    map.forEach { key, value ->
        println("$key -> $value") // apple -> 10, banana -> 20
    }

    // Mutable Map
    // the content of map can be add or modify after creation
    val mutableMap = mutableMapOf<Int, String>()

    // add map element
    mutableMap.put(1, "January")
    mutableMap[2] = "Februari"

    println(mutableMap) // {1=January, 2=Februari}
    println(mutableMap.size) // 2

    // update map element
    mutableMap[2] = "Febs"

    // remove by key
    mutableMap.remove(1)

    println(mutableMap) // {2=Febs}
}

