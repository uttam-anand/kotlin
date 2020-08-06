class Human (var n:String="p")//primary constructor
{
    var name:String=n
    fun think() {
        println("Kotlin is awesome..$name")
    }
}
fun main(args :Array<String>)
{
    var uttam=Human()
    uttam.think()
}