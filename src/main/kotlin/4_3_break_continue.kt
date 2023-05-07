
fun main(){
    // The break statement is used to jump out of a loop
    var i = 3
    while (i < 9) {
        println(i)
        i++
        if (i == 7) {
            break
        }
    }


    // The continue statement breaks one iteration (in the loop),
    // if a specified condition occurs, and continues with the next iteration in the loop.

    var j = 0
    while (j < 10) {
        if (j == 4) {
            j++
            continue
        }
        println(j)
        j++
    }
}