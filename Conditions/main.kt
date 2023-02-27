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
/*
 val aPirest = 200

    when(aPirest) {
        200, 201, 202 -> println("OK")
        400 -> println("Bad request")
        500 -> println("Man you're foul")
        else -> println("Unknown")
    }
*/
/*
 for (i in ApiResponse.values()) {
    println("${i.ordinal} = ${i.name} and status = ${i.status}")
 }
*/

seasons.Rainy.foo()

}
/*
enum class ApiResponse(val status :Int = 120) {
    OK(200),
    NOT_FOUND,
    UNAUTHORIZED,
    FORBIDEN,
    UNKNOWN,
}

*/

enum class seasons (var weather : String) {

Summer("Hot") {
    override fun foo() {
        println("C'est l'ete")
    }
},

Winter("Cold") {
    override fun foo() {
        println("C'est l'hiver")
    }
},

Rainy("Moderate") {
    override fun foo() {
        println("C'est l'autome")
    }
};
abstract fun foo()
}

