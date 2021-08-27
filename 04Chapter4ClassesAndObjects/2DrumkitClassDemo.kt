/* From the "Head First Kotlin" book
 * This program is meant to illustrate the use of classes and objects using a
 * class that represents a drum kit that can be played.
 */

class DrumKit(var hasTopHat: Boolean, var hasSnare: Boolean) {

    fun playSnare() {
        if(hasSnare) println("bang bang bang!")
    }

    fun playTopHat() {
        if(hasTopHat) println("ding ding ba-da-bing!")
    }
}



fun main(args: Array<String>) {
    val d = DrumKit(true, true)
    d.playTopHat()
    d.playSnare()
    d.hasSnare = false
    d.playTopHat()
    d.playSnare()
}