package advance
/*
 * with : 새로운 결과 반환 없이 수신 객체를 내부에서 참조 (확장 함수는 아님)
 */
fun main() {

    val str = "안녕하세요"

    val with = with(str) {
        println("length : $length")
        println("first : ${first()}")

        length
    }

    println(with)
}