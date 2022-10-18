package advance

fun main() {
    /*
     * let : null 이 아닌 경우 사용될 로직, 새로운 결과 반환
     */
    val str: String? = "안녕"
    val result: Int? = str?.let {
        println("it : $it")

        val abc: String? = "abc"
        abc?.let {
            println("inside it : $it")
        }

        1234
    }
    println("result : $result")
}