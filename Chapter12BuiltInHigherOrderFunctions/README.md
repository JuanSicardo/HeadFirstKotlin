# Built-in higher order functions

* Use **minBy()** and **maxBy()** to find the lowest or highest value in a
  collection. These functions take one parameter, a lambda whose body specifies
  the function criteria. The return type matches the type of items in the
  collection.


* Use **sumOf()** to return the sum of items in a collection. Its parameter, a
  lambda, specifies the thing you want to sum.


* The **filter()** function lets you search, or filter, a collection according
  to some criteria. You specify these criteria using a lambda, whose lambda body
  must return a **Boolean**. **filter** usually returns a **List**. If the
  functions is being used with a **Map**, however, it returns a **Map** instead.


* The **map()** function transforms the items in a collection according to some
  criteria that you specify using a lambda. It returns a **List**.


* **forEach()** works like a **for** loop. it allows you to perform one or more
  actions for each item in a collection.


* Use **groupBy()** to divide a collection into groups. It takes one parameter,
  a lambda, which defines how the function should group the items. The function
  returns a **Map**, which uses the lambda criteria for the keys, and the **
  List** for each value.


* The **fold()** function lets you specify an initial value, and perform some
  operation for each item in a collection. It takes two parameters: the initial
  value and a lambda that specifies the operation you want to perform.