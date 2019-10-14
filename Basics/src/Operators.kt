fun main() {
        /**
         * shl and shr are infix functions,
         * they can be used like number.shl(3) too
         */
        
        // shl means shift left
        val a = (2 shl 2)
        println(a)
        val b = (-2 shl 2)
        println(b)
        // shr means shift right
        val c = (2 shr 2)
        println(c)
        val d = (-2 shr 2)
        println(d)
        // and means bitwise and
        val e = (2 shl 2) and 3
        println(e)
        // or means bitwise or
        val f = (2 shl 2) or 3
        println(f)
        // xor conversion
        val g = (2 shl 2) xor 3
        println(g)


    }
