
fun main( args: Array<String>)
{
    var a1= new()
    a1.skills ="c++"
    a1.show()

    var a2= new()
    a2.skills= "java"
    a2.show()

    var a3= a1+ a2
    a3.show()
}

operator infix fun new.plus(a:new):new
{
    var nal =new()
    nal.skills=this.skills + " " +a.skills
    return nal
}
// with a1.plus(a2):fun new.plus(a:new):new is used
// with a1 plus a2:infix fun new.plus(a:new):new is used
// with a1+a2 : operator infix fun new.plus(a:new):new is used