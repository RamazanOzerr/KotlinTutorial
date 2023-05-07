fun main(){

    // we will learn more about arrays in the next chapters
    val programmingLanguages = arrayOf("Kotlin", "Java", "Python", "Swift")
    for (pl in programmingLanguages){
        println(pl)
    }

    // it is also possible loop through String variables
    val s = "hello"
    for(a in s){
        println(a)
    }

    // You can also create ranges of numbers
    for (nums in 5..15) {
        println(nums)
    }
}