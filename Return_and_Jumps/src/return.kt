fun main(){
    //Implicit Label
    ImplicitLabel()
    //Explicit Label
    ExplicitLabel()
    //Return label
    loop@for(i in 0..1)
    {
        println(i)
        for(j in 0..1)
        {
            if(i==0)
                return@loop
        }
    }
}
fun ImplicitLabel()
{
    listOf<Int>(1,2,3,4,5,6).forEach lit@{
        if(it==3)
            return@lit
        println(it)
    }
    println("Done with the explicit label")
}
fun ExplicitLabel()
{
    listOf<Int>(12,13,14,10,15).forEach{
        if(it==14)
            return@forEach
        println(it)
    }
    println("Done with the Explicit Label")
}

