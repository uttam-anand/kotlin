class AC
{
    companion object
    {
        @JvmStatic//making of static keyword (it can be used only with object and companion Object)
        fun show()
        {
            println("hello")
        }
    }

}
fun main(args:Array<String>)
{
    AC.show()
}