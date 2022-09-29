
fun main() {
    val day = 2

    val result = when (day) {
        1 -> "월"
        2 -> "화"
        3 -> "수"
        4 -> "목"
        5 -> "금"
        6 -> "토"
        7 -> "일"
        else -> "기타"
    }

    println(result)
}