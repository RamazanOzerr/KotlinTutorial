/*
    while (condition) {
      // code block to be executed
    }
*/

/*

    do {
      // code block to be executed
    }
    while (condition);

 */
fun main(){

    var i = 0
    while (i < 3) {
        println(i)
        i++ // do not forget to increase i, otherwise you'll get an infinitive loop
    }

    var j = 0
    do {
        println(j)
        j++
    }
    while (j < 5)

}