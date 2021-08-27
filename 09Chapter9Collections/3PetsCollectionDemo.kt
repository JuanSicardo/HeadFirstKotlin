/* From the "Head First Kotlin" book.
 * This code is meant to illustrate the use of List, MutableList, Set and
 * MutableSet classes.
 */

fun main() {
    val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hedgehog")

    //Write the code to print how many types of pet there are.
    val typesOfPets = petsLiam.toMutableSet()
    typesOfPets.addAll(petsSophia)
    typesOfPets.addAll(petsNoah)
    typesOfPets.addAll(petsEmily)
    println("Number of types of pet: ${typesOfPets.size}")

    //Write the code below to create a new collection named pets
    //that contains each pet.
    val pets = petsLiam.toMutableList()
    pets.addAll(petsSophia)
    pets.addAll(petsNoah)
    pets.addAll(petsEmily)
    println("All of the pets: $pets")

    //Challenge: How would you use the pets collection to get the total number
    //of pets?
    println("Total number of pets: ${pets.size}")

    //How would you list the types of pet in alphabetical order?
    println("Pets ordered in alphabetical order: ${pets.sort()}")
}