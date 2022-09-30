package advance


class MyGenerics<out T>(val t :T) {

}

fun main() {

    val generics = MyGenerics<String>("TEST")
    val generics2 = MyGenerics(123)

    val list :List<*> = listOf<String>("TEST")

    val charGe :MyGenerics<CharSequence> = generics

}