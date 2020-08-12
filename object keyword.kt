data class Book(var name: String , var price:Int)
object BookShelf
{
    var books = arrayListOf<Book>()
    fun showbooks()
    {
        for (i in books)
        {
            println(i)
        }
    }
}
fun main(args:Array<String>)
{
    BookShelf.books.add(Book("java",20))
    BookShelf.books.add(Book("kotlin",20))
    BookShelf.books.add(Book("c++",20))

    BookShelf.showbooks()
}