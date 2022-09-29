package advance

data class Person(val name: String, val age: Int)

fun main() {

    val first = Person(name = "테스트", age = 12)
    val second = Person(name = "테스트", age = 12)

    println("first == second : ${first == second}")
    println("first hascode is ${first.hashCode()}")
    println("second hascode is ${second.hashCode()}")

    println("--------------------------------------")

//    second.name = "stranger"
//
//    println("first == second : ${first == second}")
//    println("first hascode is ${first.hashCode()}")
//    println("second hascode is ${second.hashCode()}")

    val third = first.copy()
    val fourth = first.copy(name = "stranger")

    println("first == third : ${first == third}")
    println("third hascode is ${third.hashCode()}")
    println("fourth hascode is ${fourth.hashCode()}")

    println("--------------------------------------")

    println("이름 = ${first.component1()}, 나이 = ${first.component2()}")

    // 구조분해할당
    val (name, age) = first
    println("이름 = ${name}, 나이 = ${age}")
}