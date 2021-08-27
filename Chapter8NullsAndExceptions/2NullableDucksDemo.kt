/* From the "Head First Kotlin" book.
 * This code is the result of solving an exercise from the book that was meant
 * to illustrate the use of nullable variables, safe calls (?.) and the Elvis
 * operator (?:).
 */

class Duck(val height: Int? = null) {

    fun quack() {
        println("Quack! Quack!")
    }
}

class MyDucks(var myDucks: Array<Duck?>) {

    fun quack() {
        for (duck in myDucks)
            duck?.let { it.quack() }
    }

    fun totalDuckHeight(): Int {
        var h = 0
        for (duck in myDucks) {
            h += duck?.height ?: 0
        }
        return h
    }
}