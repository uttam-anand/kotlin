import java.util.*
fun main(args:Array<String>)
{
/*var nums= listOf(1,2,3,4)
    for((i,e) in nums.withIndex())
    {
        println("$i:$e")
    }
*/
    var aliens=TreeMap<String,Int>()
    aliens["Navin"]=543
    aliens["uttam"]=456
    for((name,age)in aliens)
    {
        println("$name :$age")
    }

}