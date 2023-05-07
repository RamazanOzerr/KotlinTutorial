fun main(){
    // we need to call functions inside of main
    myFunc() // this is how we call a function

    var str = "kotlin"
    myFunc2(str) // this will print 'kotlin'

    getMax(2,3) // 3

    getSum(2,3) // 5
}

// to define a function, use the keyword 'fun'
fun myFunc(){
    println("my first Kotlin function")
}

// parameters
fun myFunc2(myStr : String){
    println(myStr)
}

// return a value, the function that returns the bigger value
fun getMax(firstNum : Int, secNum : Int) : Int{
//    if(firstNum > secNum){
//        return firstNum
//    }else{
//        return secNum
//    }

     return if(firstNum > secNum) firstNum else secNum
}

// shorter way of returning values
fun getSum(firstNum : Int, secNum : Int) : Int = firstNum + secNum