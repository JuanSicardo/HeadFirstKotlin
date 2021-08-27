/* From the "Head first Kotlin" book.
 * This code is meant to illustrate the use of lambdas and higher order
 * functions.
 */

fun unless(condition: Boolean, code: () -> Unit) {
    if (!condition) code.invoke()
}

fun main(args: Array<String>) {
    val options = arrayOf("Red", "Amber", "Green")
    var crossWalk = options[(Math.random() * options.size).toInt()]

    println(crossWalk)

    if (crossWalk == "Green") {
        println("Walk!")
    }

    unless(crossWalk == "Green") {
        println("Stop")
    }
}