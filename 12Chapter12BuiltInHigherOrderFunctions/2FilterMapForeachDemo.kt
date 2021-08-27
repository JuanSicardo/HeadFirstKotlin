/* From the "Head first Kotlin" book.
 * This code is meant to illustrate the use of the built-in higher order
 * functions of Kotlin: filter, map, forEach.
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

    val vegetables = groceries.filter { it.category == "Vegetables" }
    println("vegetables: $vegetables")

    val notFrozen = groceries.filterNot { it.category == "Frozen" }
    println("notFrozen: $notFrozen")

    val groceryNames = groceries.map { it.name }
    println("groceryNames: $groceryNames")

    val halfUnitPrice = groceries.map { it.unitPrice / 0.5 }
    println("halfUnitPrice: $halfUnitPrice")

    val newPrices =
        groceries.filter { it.unitPrice > 3.0 }.map { it.unitPrice * 2 }
    println("newPrices: $newPrices")

    println("Grocery names: ")
    groceries.forEach { println(it.name) }

    println("Groceries with unitPrice > 3.0: ")
    groceries.filter { it.unitPrice > 3.0 }.forEach { println(it.name) }

    var itemNames = ""
    groceries.forEach { itemNames += it.name }
    println("itemNames: $itemNames")
}