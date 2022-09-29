class Product(val name: String, val price: Int)

interface Wheel {
    fun roll()
}

interface Cart :Wheel {

    var coin: Int

    val weight: String
        get() = "50Kg"

    fun add(product: Product)

    fun rent() {
        if (coin > 0) {
            println("카트를 대여합니다.")
        }
    }

    fun printId() = println("123")
}

interface Order {
    fun add(product: Product) {
        println("주문완료")
    }

    fun printId() = println("456")
}

class MyCart(override var coin: Int) :Cart, Order {
    override fun add(product: Product) {
        if (coin <= 0) println("코인을 넣어주세요")
        else println("${product.name} 이(가) 카트에 추가되었습니다.")

        super<Order>.add(product)
    }

    override fun printId() {
        TODO("Not yet implemented")
    }

    override fun roll() {
        println("돌돌돌...")
    }
}



fun main() {
    val cart = MyCart(coin = 100)
    cart.rent()
    cart.add(Product(name = "장난감", price = 1000))
    cart.roll()
}