# Abstract Classes and Interfaces

* An abstract class can't be instantiated. It can contain both abstract and
  non-abstract properties and functions.<br><br>
* Any class that contains an abstract property of function must be declared
  abstract.<br><br>
* A class that's not abstract is called concrete.<br><br>
* You implement abstract properties and functions by overriding them.<br><br>
* All abstract properties and functions must be overridden in any concrete
  subclasses.<br><br>
* An interface lets you define common behavior outside a superclass hierarchy so
  that independent classes can still benefit from polymorphism.<br><br>
* Interfaces can have abstract or non-abstract functions.<br><br>
* Interfaces properties can be abstract, or they can have getters and setters.
  They can't be initialized, and they don't have access to a backing
  field.<br><br>
* A class can implement multiple interfaces.<br><br>
* If a subclass inherits from a superclass (or implements an interface) named **
  A**, you can use the code:<br><br>

````kotlin
super<A>.myFunction
````

to call the implementation of **myFunctions** that's defined in **A**.<br><br>

* If a variable holds a reference to an object, you can use the **is** operator
  to check the type of the underlying object.<br><br>
* The **is** operator performs a smart cast when the compiler can guarantee that
  the underlying object can't have changed between the type check and its
  usage.<br><br>
* The **as** operator lets you perform an explicit cast.<br><br>
* A **when** expression lets you compare a variable against an exhaustive set of
  different options.<br><br>