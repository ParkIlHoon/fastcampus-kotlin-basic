package advance

import java.lang.Exception

fun getStr() :Nothing = throw Exception("예외 발생")

fun main() {

    val result = try {
        getStr()
    } catch (e: Exception) {
        println(e.message)
        "기본값"
    }
    println(result)

    val result2 = runCatching { getStr() }
        .getOrElse {
            println(it.message)
            "기본값"
        }
    println(result2)

    val result3 = runCatching { getStr() }
        .exceptionOrNull()
    result3?.let {
        println(it.message)
//        throw it
    }

    val result4 = runCatching { getStr() }
        .getOrDefault("기본값")
    println(result4)

    val result5 = runCatching { "안녕" }
        .map { "${it}하세요" }
        .getOrThrow()
    println(result5)

    val result6 = runCatching { getStr() }
        .recover {
            "복구"
        }
        .getOrNull()
    println(result6)

    val result7 = runCatching { getStr() }
        .recoverCatching {
            throw Exception("예외")
        }
        .getOrDefault("기본값")
    println(result7)

}