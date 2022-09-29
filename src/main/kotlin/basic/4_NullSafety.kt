fun main() {

    var a : String? = null
    println(a)

    val b : Int = if (a != null) a.length else 0
    println(b)

    val c = a?.length ?: 0
    println(c)
}