# Basic types and variables

* In order to create a variable, the compiler needs to know its name, its type,
  and whether it can be reused.<br><br>
* If the variable's type isn't explicitly defined, the compiler infers it from
  its value.<br><br>
* A variable holds a reference to an object.<br><br>
* An object has state and behaviour. Its behaviour is exposed through its
  functions.<br><br>
* Defining the variable with **var** means the variable's object reference can
  be replaced. Defining the variable with **val** means the variable holds a
  reference to the same object forever.<br><br>
* Kotlin has a number of basic types: **Byte**, **Short**, **Int**, **Long**, **
  Float**, **Double**, **Boolean**, **Char** and **String**.<br><br>
* Explicitly define a variable's type by putting a colon after the variable's
  name, followed by the type:

````kotlin
var tinyNum: Byte
````

* You can only assign a value to a variable that has a compatible type.<br><br>
* You can convert one numeric type to another. If the value doesn't fit into the
  new type, some precision is lost.<br><br>
* Create an array using the **arrayOf( )** function:

````kotlin
var myArray = arrayOf(1, 2, 3)
````

* Access an array's items using, for example:

````kotlin
myArray[0]
````

The first item in an array has an index of 0.<br><br>

* Get an array's size using:

````kotlin
Array.size
````