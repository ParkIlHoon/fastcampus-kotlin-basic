package advance

// 같은 패키지/모듈에 존재해야 함
sealed class Developer {
    abstract val name :String
    abstract fun code(language :String)
}

data class BackendDeveloper(override val name: String) :Developer() {
    override fun code(language: String) {
        println("저는 백엔드 개발자 ${name}입니다. ${language}를 사용합니다.")
    }
}

data class FrontendDeveloper(override val name: String) :Developer() {
    override fun code(language: String) {
        println("저는 프론트엔드 개발자 ${name}입니다. ${language}를 사용합니다.")
    }
}

object OtherDeveloper :Developer() {
    override val name: String = "익명"

    override fun code(language: String) {
        println("저는 익명 개발자 ${name}입니다. ${language}를 사용합니다.")
    }
}
///////////////////////////////

object DeveloperPool {
    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when(developer) {
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
        is OtherDeveloper -> println("지원하지 않는 개발자입니다.")
    }

    fun get(name: String) = pool[name]
}

fun main() {
    val back = BackendDeveloper(name = "일훈")
    val front = FrontendDeveloper(name = "후후")

    DeveloperPool.add(back)
    DeveloperPool.add(front)

    println(DeveloperPool.get("일훈"))
    println(DeveloperPool.get("후후"))

    println(DeveloperPool.get("일훈")?.code("java"))
    println(DeveloperPool.get("하하")?.code("vue"))

    DeveloperPool.add(OtherDeveloper)
}

