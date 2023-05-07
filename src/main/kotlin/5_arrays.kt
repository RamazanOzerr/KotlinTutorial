fun main(){

    // this is how you can define an array
    var pl = arrayOf("Kotlin", "Java", "Python", "Swift")

    // you can access a spesific value in the array by indexing
    println(pl[1]) // Java

    // to change a value in array:
    pl[2] = "C"

    // size of an array
    println(pl.size) // 4

    // to check whether if an element exists in the array
    println("Java" in pl) // true
    // you can also do this by if statement
    if("Java" in pl) println("true") // as you can see, it is not required to use curly
                                     // braces if there's only one statement, just like Java
    if("Java" in pl){
        println("true")
    }

    // loop through an array
    for(p in pl){
        println(p)
    }
}