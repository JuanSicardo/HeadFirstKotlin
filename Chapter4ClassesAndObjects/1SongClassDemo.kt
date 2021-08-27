/* From the "Headfirst Kotlin" book
 * This code is meant to illustrate the use of classes and objects, with a class
 * called song that can be played or stopped.
 */

class Song(val title: String, val artist: String) {

    fun play() {
        println("playing the song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }
}

fun main(args: Array<String>) {
    val songOne = Song("The Mesopotamians", "They Might Be Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Harley")

    songTwo.play()
    songTwo.stop()
    songThree.play()
}