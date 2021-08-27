# Nulls and exceptions

* **null** is a value that means a variable doesn't hold a reference to an
  object. The variable exists, but it doesn't refer to anything.<br><br>
* A nullable type can hold null values in addition to its base type. You define
  a type as nullable by adding a **?** to the end of it.<br><br>
* To access nullable variable's properties and functions, you must first check
  that it's not null.<br><br>
* If the compiler can't guarantee that a variable is not null in between a
  null-check and its usage, you must acess properties and functions using the
  safe call operator (**?.**).<br><br>
* You can chain safe calls together.<br><br>
* To execute code if (and only if) a value is not null use **?.let**.<br><br>
* The Elvis operator (**?:**) is a safe alternative to an **if**
  expression.<br><br>
* The not-null assertion operator (**!!**) throws a **NullPointerException** if
  the subject of your assertion is null.<br><br>
* An exception is a warning that occurs in exceptional situations. It's an
  object of type **Exception**.<br><br>
* Use **throw** to throw an exception.<br><br>
* Catch an exception using **try**/**catch**/**finally**.<br><br>
* **try** and **throw** are expressions.<br><br>
* Use a safe cast (**as?**) to avoid getting a **ClassCastException**.<br><br>