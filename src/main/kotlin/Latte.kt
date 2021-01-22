class Latte (
    private val sugar: Int,
    private val milk: Int
) {
    private val basePrice = 6.2

    val price: Double get() = basePrice  + (sugar * 1.2) + (milk * 1.5)
    override fun toString(): String {
        return "Latte with: $sugar and $milk"
    }

}