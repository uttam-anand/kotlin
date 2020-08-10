open class Humane(age:Int=10)
{
    init {
        println("in humane "+age)
    }
   open fun think()
    {
        println("Real Thinking")
    }
}
class Alien(age:Int) : Humane(age)
{
    init {
        println("in alien")
    }
   override fun think()
    {
        println("virtual thinking")
    }

}

fun main(args:Array<String>)
{
    var mayank= Alien(20)
    mayank.think()
}