fun main(){

    // When using var, you can change the value whenever you want:
    var goat = "fatih terim"
    goat = "messi"

    // when using val, that variable always stores the same value, unchangable
    val pi = 3.14
    // pi = 2.5; this line will not be allowed since pi is a val

    // DATA TYPES
    var num = 10             // Int
    var doub = 5.99    // Double
    var letter = 'A'        // Char
    var bool = true      // Boolean
    var str = "Hello"      // String

    // it is also possible to specify the type of the variable
    var num2: Int = 10                // Int
    var doub2: Double = 3.14    // Double
    var letter2: Char = 'A'          // Char
    var bool2: Boolean = true     // Boolean
    var str2: String = "Hello"      // String

    // TYPE CONVERSATION
    //To convert a numeric data type to another type, you must use one of the following functions:
    // toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():
    var x: Int = 5
    var y: Long = x.toLong()
    println(y)
}