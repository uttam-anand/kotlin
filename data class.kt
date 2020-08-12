data class laptop(val brand:String, val price:Int)
{
    fun show()
    {
        println("Awesome machine")
    }
}

fun main(args:Array<String>)
{
       var lap1=laptop("Dell", 2000)
       var lap2=laptop("Dell", 2000)
       var lap=lap1.copy(price=2200)
       println(lap1.equals(lap2))
    println(lap)
}