# Generics

* Generics let you write consistent code that's type-safe. Collections such as **MutableList** use generics.


* The generic type is defined inside angle brackets **<>**, for example:

````kotlin
class Contest<T>
````

* You can restrict the generic type to a specific supertype, for example:

````kotlin
class Contest<T:Pet>
````

* You create an instance of a class with a generic type by specifying the "real" type in angle brackets, for example:

````kotlin
Contest<Cat>
````

* Where possible, the compiler will infer the generic type.


* You can define a function that uses a generic type outside a class declaration, or one that uses a different generic type, for example:

````kotlin
fun <T> listPet(): List<T> {
    //Code goes here
}
````

* A generic type is invariant if it can only accept references of that specific type. Generic types are invariant by default.


* A generic type is covariant if you can use a subtype in place of a supertype. You specify that a type is covariant by prefixing it with **out**.


* A generic type is contravariant if you can use a super-type in place of a subtype. You specify that a type is contravariant by prefixing it with **in**.