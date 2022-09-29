

fun greeting(message: String = "안녕하세요") {
    println(message)
}

fun log(level: String = "INFO", message: String) {
    println("[$level]$message")
}


fun main () {
    greeting()
    greeting("hi~~")
    log(level = "WARN", message = "안뇽~")
}