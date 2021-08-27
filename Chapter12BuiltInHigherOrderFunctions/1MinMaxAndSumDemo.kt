/* From the "Head first Kotlin" book.
 * This code is meant to illustrate the use of the built-in higher order
 * functions of Kotlin: maxByOrNull, minByOrNull and sumOf
 */

data class Grocery(
    val name: String,
    val category: String,
    val unit: String,
    val unitPrice: Double,
    val quantity: Int
)

fun main() {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetables", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetables", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2),
    )

    val highestUnitPrice = groceries.maxByOrNull { it.unitPrice * 5 }
    println("highestUnitPrice: $highestUnitPrice")

    val lowestQuantity = groceries.minByOrNull { it.quantity }
    println("lowestQuantity: $lowestQuantity")

    val sumQuantity = groceries.sumOf { it.quantity }
    println("sumQuantity: $sumQuantity")

    val totalPrice = groceries.sumOf { it.unitPrice * it.quantity }
    println("totalPrice: $totalPrice")
}