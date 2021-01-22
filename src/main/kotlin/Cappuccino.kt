class Cappuccino(
    private val sugar: Int,
    private val milk: Int,
    private val hasCinnamon: Boolean
) {
    private val basePrice = 5.3
    private val cinnamonPrice: Double get() = if (hasCinnamon) 0.8 else 0.0

    val price: Double get() = basePrice + cinnamonPrice + (sugar * 1.2) + (milk * 1.5)

    override fun toString(): String {
        return "Cappuccino with: $sugar and $milk"
    }

}