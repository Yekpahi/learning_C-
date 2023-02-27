fun main() {
   /*  var a = 10;
    var  b = 10;

    val result = if(a > b) a else b;
    println("Le resultat est : $result")

    val result2 = if(a>b) {
        a++
        a
    } else {
        b++
        b
    }
    println("Le resultat2 : $result2")
    */

    val aPirest = 200

    when(aPirest) {
        200, 201, 202 -> println("OK")
        400 -> println("Bad request")
        500 -> println("Man you're foul")
        else -> println("Unknown")
    }
}