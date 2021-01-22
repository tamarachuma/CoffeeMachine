import java.util.*
import java.lang.System.`in`

fun main() {

    val coffeeMachine = CoffeeMachine(Scanner(`in`))

    val price = coffeeMachine.request()

    println("Total: $price \n Thank You For Visiting Us!")
}
