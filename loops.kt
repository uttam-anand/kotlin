fun main( args:Array<String>)
{
    //var mim= 16 downTo 1//until (1 until 16)removes the last element
    var mim = 'A'..'z'
    for (a in mim )//mim.reversed()-reverse the list
    {
        println(a)
    }
    println("count is"+ mim.count())
}
