//@file:JvmName("First")    ->   Changes the class name to the name specified


fun main(args: Array<String>)
{
    var result=max(4,5)
    println(result)
}
fun add(a:Int,b:Int):Int= a+b
fun max (a:Int,b:Int):Int=if(a>b) a else b