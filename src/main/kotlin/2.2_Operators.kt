
fun main(){

    /*
        Arithmetic Operators: Kotlin supports the standard arithmetic operators,
        including +, -, *, /, and %. For example, you can use the + operator to add two numbers:
    */
    val a = 5
    val b = 10
    val c = a + b // c is now 15

    /*
        Comparison Operators: Kotlin supports the standard comparison operators,
        including ==, !=, <, >, <=, and >=. For example, you can use the == operator to test if two values are equal:
    */
    val a2 = 5
    val b2 = 10
    val isEqual = (a2 == b2) // isEqual is false

    /*
        Logical Operators: Kotlin supports the standard logical operators,
        including &&, ||, and !. For example, you can use the && operator to combine two logical expressions:
    */
    val a3 = 5
    val b3 = 10
    val isTrue = (a3 > 0) && (b3 < 20) // isTrue is true


    /*
        Assignment Operators: Kotlin supports a variety of assignment operators
        that combine an arithmetic or bitwise operation with an assignment.
        For example, you can use the += operator to add a value to a variable
        and assign the result to the same variable:
     */
    var a4 = 5
    a4 += 10 // a4 is now 15

}