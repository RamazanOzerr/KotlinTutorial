fun main(){
    // indexing is possible on String variables
    val txt = "Hello World"
    println(txt[0]) // H
    println(txt[5]) // o

    println(txt.length) // 11
    val txt2 = "hello "
    val txt3 = "new kotlin developers"
    println(txt2 + txt3) // hello new kotlin developers
    println(txt2.plus(txt3)) // hello new kotlin developers

    val txt4 = "Rick"
    val txt5 = "Grimes"
    println("hello $txt4 $txt5") // hello Rick Grimes
}