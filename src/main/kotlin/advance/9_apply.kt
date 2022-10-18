package advance

/*
 * apply: 수신객체의 프로퍼티를 구성하고 수신객체의 결과를 그대로 반환
 */
fun main() {
    val apply :DatabaseClient = DatabaseClient().apply {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"

        connect()
    }

    println(apply)
}