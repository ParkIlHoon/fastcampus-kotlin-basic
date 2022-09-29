class EmptyClass

class Coffee(
    var name: String = "",
    var price: Int = 0,
    ) {

    val brand : String
        get() {
            return "스타벅스"
        }

    var quantity : Int = 0
        set(value) {
            if(value > 0) {
                field = value
            }
        }
}

fun main() {
    val coffee = Coffee()
    coffee.name = "아이스 아메리카노"
    coffee.price = 2000
    coffee.quantity = -1

    println("${coffee.brand}커피 [${coffee.name}]는 ${coffee.quantity}개 남았으며, 가격은 ${coffee.price}원입니다")
}