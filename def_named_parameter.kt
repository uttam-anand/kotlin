fun main(args: Array<String>)
{
    var finalAmt=clacAmount(amt=50,interest=0.03)//sequence doesn't mater if we are having named parameters
    println(finalAmt)
}
//@JvmOverloads -->>  overloads in the java code
fun clacAmount(amt:Int, interest:Double=0.04):Double{
    return (amt+amt*interest)
}