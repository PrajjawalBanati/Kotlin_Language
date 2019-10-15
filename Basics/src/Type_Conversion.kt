fun main() {
        //Different Data Types
        var a = 1 //Int
        var b = 2.0376423434732f //Float variable will only take upto 2.037642
        var c = 100000000000 //Declaring Implicit Long variable 
        var c2 = 1000L //Declaring Long variable explicitly by using suffix L or l if it might be inferred as int
        val d = 3.23 //Double
        
        //Type conversions are possible by using .to<Datatype>() functions
        val e: Int = 3000
        val f: Long = e.toLong()
        val g: Float = f.toFloat()
        val h: Byte = e.toByte()
        val i: Char = e.toChar()
        
        //Numeric Literals
        val j = 0xFFECDE5E //HexaDecimal
        val k = 0b11010010011010011001010010010010 //Binary
        val l = 123L //Long
        
        //Underscores in numeric Literals make it more readable
        val m: Long = 400_000_000_000
        val n: Long = 0xFF_EC_DE_5E
        val o = 0b11010010_01101001_10010100_10010010
        val p = 0b01010010_01101001_10010100_10010010
        
        print("$a\n$b\n$c\n$c2\n$d\n$e\n$f\n$g\n$h\n$i\n$j\n$k\n$l\n$m\n$n\n$o\n$p")

    }
