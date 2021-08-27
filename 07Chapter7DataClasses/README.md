# Data classes

* The behavior of the **==** operator is determined by the implementation of the
  equals function.<br><br>
* Every class inherits an **equals**, **hashCode**, and **toString** function
  from the **Any** class because every class is a subclass of **Any**. These
  functions can be overridden.<br><br>
* The **equals** functions tells yu if two objects are considered "equal". By
  default, it returns **true** if it's used to test the same underlying object,
  and **false** if it's used to test separate objects.<br><br>
* The **===** operator lets you check whether two variables refer to the same
  underlying object irrespective of the object's type.<br><br>
* A data class lets you create objects whose main purpose is to store data. It
  automatically overrides the **equals**, **hashCode** and **toString**
  functions, and includes **copy** and **componentN** functions.<br><br>
* The data class **equals** function checks for equality by looking at each
  object's property values. If two data objects hold the same data, the **
  equals** function returns **true**.<br><br>
* The **copy** function lets you create a new copy of a data object, altering
  some of its properties. The original object remains intact.<br><br>
* **componentN** functions let you destructure data objects into their component
  property values.<br><br>
* A data class generates its functions by considering the properties defined in
  its primary constructor.<br><br>
* Constructors and functions can have default parameter values. You can call a
  constructor or functions by passing parameter values in order of declaration
  or by using named arguments.<br><br>
* Classes can have secondary constructors.<br><br>
* An overloaded function is a different function that happens to have the same
  function name. An overloaded function must have different arguments, but may
  have a different return type.<br><br>

## Rules for data classes

* There must be a primary constructor.
* The primary constructor must define one or more parameters.
* Each parameter must be marked as **val** or **var**.
* Data classes must not be open or abstract.