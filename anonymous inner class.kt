interface Hello
{
    fun think()
}
fun main(args:Array<String>)
{
    var programmer: Hello= object: Hello
    {
        override fun think()
        {
            println(" Virtual thinking")
        }
    }
    programmer.think()
}