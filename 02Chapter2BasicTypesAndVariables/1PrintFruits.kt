/* From the Headfirst Kotlin book
 * This program should produce the following output:
 * Fruit = Banana
 * Fruit = Blueberry
 * Fruit = Pomegranate
 * Fruit = Cherry
 */

fun main(args: Array<String>) {

    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    val index = arrayOf(1, 3, 4, 2)

    var x = 0
    var y: Int

    while (x < 4) {
        y = index[x]
        println("Fruit = ${fruit[y]}")
        x = x + 1
    }
}