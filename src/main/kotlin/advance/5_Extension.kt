package advance


fun String.first() :Char {
    return this[0]
}

fun String.addFirst(char :Char) :String {
    return char + this.substring(0)
}


class MyExample {
    fun printMessage() = println("클래스")
}

fun MyExample.printMessage() = println("확장 함수")

fun MyExample?.printNullOrNotNull() {
    if (this == null) println("널입니다")
    else println("널이 아닙니다.")
}

fun main() {
    println("TEST".first())
    println("TEST".addFirst('a'))

    MyExample().printMessage()

    MyExample().printNullOrNotNull()
    val myExample : MyExample? = null
    myExample.printNullOrNotNull()
}