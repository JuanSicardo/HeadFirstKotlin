# Subclasses and superclasses

* A superclass contains common properties and functions that are inherited by
  one or more subclasses.<br><br>
* A subclass can include extra properties and functions that aren't in the
  superclass, and can override the things it inherits.<br><br>
* Use the *IS-A* test to verify that your inheritance is valid. If *X* is a
  subclass of *Y*, then *X IS-A Y* must make sense.<br><br>
* The *IS-A* relationship works in only one direction. A Hippo is an Animal, but
  not all Animals are Hippos.<br><br>
* If class *B* is a subclass of class *A*, and class *C* is a subclass of
  class *B*, class *C* passes the *IS-A* test for both *B* and *A*.<br><br>
* Before you can use a class as a superclass, you must declare it open. You must
  also declare any properties and functions you want to override as
  open.<br><br>
* Use: to specify a subclass's superclass.<br><br>
* If the superclass has a primary constructor, then you must call it in the
  subclass header.<br><br>
* Override properties and functions in the subclass by prefixing them with
  override. When you override a property, its type must be compatible with that
  of the superclass property. When you override a function, its parameter list
  must stay the same, and its return type must be compatible with that of the
  superclass.<br><br>
* Overridden functions and properties stay open until they're declared
  final.<br><br>
* When a function is overridden in a subclass, and that function is invoked on
  an instance of the subclass, the overridden version of the function is
  called.<br><br>
* Inheritance guarantees that all subclasses have the functions and properties
  defined in the superclass.<br><br>
* You can use a subclass in any place where the superclass type is
  expected.<br><br>
* Polymorphism means "many forms". It allows different subclasses to have
  different implementations of the same function.<br><br>