fun Iteration() {
        var stringList = listOf<String>("Prajjawal", "Prakhar", "Nirmaljeet", "Sajal")
        var b = listOf<String>("apple", "mango", "banana", "peach", "Cucumber")
        var c: Int = 0
        for (item in stringList) {
            println(item)
        }
        while (c < stringList.size) {
            println(b[c])
            c++
        }

        // you can use forEach in lists
        stringList.forEach { item ->
            println(item)
        }

        // if you do not provide variable name in forEach, it is named 'it'
        stringList.forEach {
            println(it)
        }

        // forEach can be indexed
        stringList.forEachIndexed { index, it ->
            println("for index $index, item is $it")
        }

    }

    fun main() {
        var x: Int = 10
        for (y in 1..x) {
            println("$y fits in the range of x")
        }
        Iteration()
    }
