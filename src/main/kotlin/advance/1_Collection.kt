package advance

fun main() {
    // immutable
    val currencyList = listOf("달러", "유로", "원")

    // mutable
    val mutableCurrencyList = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }

    val mutableMap = mutableMapOf<String, Int>()
    mutableMap["one"] = 1
    mutableMap["two"] = 2
    mutableMap["three"] = 3

    // 컬렉션 빌더
    val numberList :List<Int> = buildList {
        add(1)
        add(2)
        add(3)
    }

    currencyList.forEach {
        println(it)
    }

    println("===================")

    mutableCurrencyList.map {
        it.substring(1)
    }.filter {
        it.isNotBlank()
    }.forEach {
        println(it)
    }

    println("===================")
}