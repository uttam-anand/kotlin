abstract class Humanee
{
    abstract fun think()
    fun talk()
    {
        println("talking")
    }
}
class doctor :Humanee()
{
    override fun think()
    {
        println("critical thinking")
    }
}
class Alieen() : Humanee()
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
    var mayank= Alieen()
    mayank.talk()
    mayank.think()
}