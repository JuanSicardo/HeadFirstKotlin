/* From the "Head First Kotlin" book
 * This code is meant to illustrate the way one can declare an abstract class
 * and use it to create a concrete class
 */

abstract class Appliance {
    var pluggedIn = true

    abstract val color: String
    abstract fun consumePower()
}

class CoffeMaker: Appliance() {
    override val color = ""
    var coffeeLeft = false

    override fun consumePower() {
        println("Consuming power")
    }

    fun fillWithWater() {
        println("Fill with water")
    }

    fun makeCoffee() {
        println("Make the coffee")
    }
}