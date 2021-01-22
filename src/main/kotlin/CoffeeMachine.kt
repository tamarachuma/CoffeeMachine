import java.util.*

class CoffeeMachine(private val scan: Scanner) {
    fun request(): Double {
        val codeForCappuccino = "cc1"
        val codeForLatte = "cl2"
        println(
            "Please choose coffee type. " +
                    "\n input only special code available on the left side of a coffee name." +
                    "\n options: \n\n $codeForCappuccino \t|\t Cappuccino \n $codeForLatte \t|\t Latte"
        )

        return when (scan.next()) {
            codeForLatte -> Latte(scan.nextInt(), scan.nextInt()).price
            codeForCappuccino -> Cappuccino(requestSugar(), requestMilk(), hasCinnamon()).price
            else -> {
                println("Please insert valid coffee code")
                return 0.0
            }

        }

    }

    private fun hasCinnamon(): Boolean {
        println("Do you want to add cinnamon? answer true or false")
        return scan.nextBoolean()
    }

    private fun requestSugar(): Int {
        println("Please enter sugar quantity: ")
        return when (val sugar = scan.nextInt()) {
            in Int.MIN_VALUE..0 -> 0
            else -> sugar
        }
    }

    private fun requestMilk(): Int {
        println("Please enter milk quantity: ")
        return when (val milk = scan.nextInt()) {
            in Int.MIN_VALUE..0 -> 0
            else -> milk
        }
    }
}