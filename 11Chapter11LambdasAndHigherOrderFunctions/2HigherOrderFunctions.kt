/* From the "Head first Kotlin" book.
 * This code is meant to illustrate the use of Lambdas and higher order
 * functions.
 */

fun convert(x: Double, converter: (Double) -> Double): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun convertFive(converter: (Int) -> Double): Double {
    val result = converter(5)
    println("5 is converted to $result")
    return result
}

fun main(args: Array<String>) {
    convert(20.0) { it * 1.8 + 32 }
    convertFive { it * 1.8 + 32 }
}