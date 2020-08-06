import java.math.BigInteger

/*fun main(args: Array<String>)     :       HEAD RECURSION
{
    var num = BigInteger("10")
    println(fact(num))
}

fun fact(n:BigInteger):BigInteger
{
    if (n==BigInteger.ZERO) {
        return BigInteger.ONE
    } else
        return n*fact(n-BigInteger.ONE)
}
*/
fun main(args: Array<String>)
{
    var num = BigInteger("7")
    println(fact(num,BigInteger.ONE))
}

tailrec fun fact(n:BigInteger,result:BigInteger):BigInteger
{
    if (n==BigInteger.ZERO) {
        return result
    } else
        return fact(n-BigInteger.ONE,n*result)
}
