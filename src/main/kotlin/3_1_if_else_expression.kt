/*
    if (condition1) {
      // block of code to be executed if condition1 is true
    } else if (condition2) {
      // block of code to be executed if the condition1 is false and condition2 is true
    } else {
      // block of code to be executed if the condition1 is false and condition2 is false
    }
*/


fun main(){
    val a = 10
    val b = 5
    if (a > b) {
        println("10 is greater than 5")
    }

    val time = 10
    if(time < 12){
        println("good morning")
    }else if(time in 13..17){ // time > 12 && time < 18
        println("good afternoon")
    }else{
        println("good night")
    }


    // just like Java, you can ommit the curly braces {} when if has only one statement:
    val greeting = if (time < 18) "Good day." else "Good evening."
    println(greeting)
}
