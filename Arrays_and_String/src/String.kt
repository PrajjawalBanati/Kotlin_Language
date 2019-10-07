fun main()
{
    val str1:String="System.out.println(a)"
    val str3:String="System.out.println(b)"
    val str: String="Hello my name is Prajjawal"
    println(str)
    val str2: String="""Hi my name is Prajjawal. In this I have used 3 inverted commas and
        |we can write it in the form of space|Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
    """.trimMargin()
    println(str2)
    //Converts the string to hashcode
    println(str1.hashCode())
    //Compare two strings
    println(str3.compareTo(str1))
    //substring before "(" character
    println(str3.substringBefore("("))
    //Whether the string contains the string
    println(str3.contains("System.out.println"))
}