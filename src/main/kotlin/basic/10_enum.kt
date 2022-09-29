

enum class PaymentStatus(val label: String): Payable {
    UNPAID("미지급") {
        override fun isPayable() = true
    },
    PAID("지급완료") {
        override fun isPayable() = false
    },
    FAILED("지급실패") {
        override fun isPayable() = false
    },
    REFUNDED("환불") {
        override fun isPayable() = false
    };
}

interface Payable {
    fun isPayable(): Boolean
}

fun main() {
    val paymentStatus = PaymentStatus.PAID
    print(paymentStatus.isPayable())
}