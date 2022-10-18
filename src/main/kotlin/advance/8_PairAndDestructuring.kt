package advance

data class Tuple(val a: Int, val b: Int)

fun plus(t: Tuple) = t.a + t.b

fun plusPair(pair: Pair<Int, Int>) = pair.first + pair.second

fun main() {
    val plus = plus(Tuple(1, 2))
    println(plus)

    val pair = Pair(4, 5)
    println(plusPair(pair))

    val newPair = pair.copy(first = 9)
    println(plusPair(newPair))
    println(newPair.component2())

    val ints = newPair.toList()
    println(ints)

    println(Triple("A","B","C").toList())

    val (a, b, c) = Triple("가", "나", "다")
    println("$a, $b, $c")

    val map = mutableMapOf("가" to "하")
    for ((key, value) in map) {
        println("${key}는 $value")
    }
}