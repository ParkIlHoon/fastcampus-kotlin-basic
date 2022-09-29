
fun main() {

    for (i in 0 .. 3) {
        println(i)
    }

    for (i in 0 until 3) {
        println(i)
    }

    for (i in 0 .. 6 step 2) {
        println(i)
    }

    for (i in 3 downTo 0) {
        println(i)
    }

    val numbers = arrayOf(1, 2, 3)
    for (i in numbers) {
        println(i)
    }

}