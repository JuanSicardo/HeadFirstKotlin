/* From the "Head first Kotlin" book.
 * This code is meant to illustrate the use of generics.
 */

abstract class Pet(var name: String)
class Cat(name: String) : Pet(name)
class Dog(name: String) : Pet(name)
class Fish(name: String) : Pet(name)

class PetOwner <T:Pet> (t:T) {
    val pets = mutableListOf(t)

    fun add(t: T) {
        pets.add(t)
    }

    fun remove(t: T) {
        pets.remove(t)
    }
}

fun main(args: Array<String>) {
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")
    val catOwner = PetOwner(catFuzz)
    catOwner.add(catKatsu)
}