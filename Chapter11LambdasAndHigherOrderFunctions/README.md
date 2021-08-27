# Lambdas and higher order functions

* A lambda expression, or lambda, takes the form:

````kotlin
{ x:Int -> x + 5 }
````

The lambda is defined within curly braces, and can include parameters, and a body.

* A lambda can have multiple lines. The last evaluated expression in the body is used as the lambda's return value.


* You can assign a lambda to a variable. The variable's type must be compatible with the type of the lambda.


* A lambda's type has the format:

````kotlin
(parameters) -> return_type
````

* Where posible, the compiler can infer the lambda's parameter types.


* You can pass a lambda to a function as a parameter, or use one as a function's return value. A function that uses a lambda in this way is known as a higher-order function.


* If the final parameter of a function is a lambda, you can move the lambda outside the function's parentheses when you call the function.


* If a function has a single parameter that's a lambda, you can omit the parentheses when you call the function.


* A type alias lets you provide an alternative name for an existing type. You define a type alias using **typealias**.