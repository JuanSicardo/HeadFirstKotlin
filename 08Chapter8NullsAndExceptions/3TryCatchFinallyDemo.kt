/* From the "Head First Kotlin" book.
 * This code is the result of a coding exercise meant to illustrate the use of
 * try/catch/finally blocks.
 */

class BadException : Exception()

fun myFunction(test: String) {
    print("t")
    print("h")

    try{
        riskyCode(test)
    } catch(e : BadException) {
        print("a")
    }
    finally{
        print("w")
        print("s")
    }
}

fun riskyCode(test:String) {
    if(test == "Yes") {
        throw BadException()
    }

    print("r")
    print("o")
}

fun main(){
    myFunction("No")
}