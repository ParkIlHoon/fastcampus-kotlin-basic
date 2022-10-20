package advance

fun main() {

    val list = mutableListOf(printHello)
    list[0]()

    val func = list[0]
    func()

    call(printHello)

    printMessage("TEST")

    println(plus(1, 2))

    println("-----------------")

    forEachStr(listOf("a", "b", "c"), printMessage)

    listOf("a", "b", "c")
        .map(upperCase)
        .forEach(printMessage)

    println("-----------------")

    outerFunc()()

    arg1 {
        it.length
        it.first()
    }

    arg2 { a: String, b: String ->
        a.length
        b.first()
    }

//    val callReference : () -> Unit = { printHello() }
//    callReference()
    val callReference = ::printHello
    callReference()()
}


val printHello : () -> Unit = { println("Hello") }

fun call(block: () -> Unit) {
    block()
}

val printMessage: (String) -> Unit = { println(it) }

val plus: (Int, Int) -> Int = { a, b -> a + b }

// 고차 함수
fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for (item in collection) {
        action(item)
    }
}

val upperCase : (String) -> String = { it.uppercase() }

// 익명 함수
fun outerFunc() : () -> Unit = { println("익명 함수랍니다") }

// 람다 표현식의 전체 식
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

// 최대한 생략한 람다 식
val sum2 = { x: Int, y: Int -> x + y }

fun arg1(block: (String) -> Unit) {}

fun arg2(block: (String, String) -> Unit) {}