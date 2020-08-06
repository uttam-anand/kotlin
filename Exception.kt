import java.lang.NumberFormatException

fun main(args: Array<String>) {
    var str: String = "4a"
    var num: Int = 0
    try {
        num= str.toInt()
    }
    catch (e:NumberFormatException)
    {
        println("Give right input")
    }
    num++
    println(num)

}
