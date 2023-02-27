fun main() {
  calc(25, 13);
  val myname = getName("Prince", "Ange")

  println(myname)
}

private fun calc(a: Int, b : Int): Int {
    var num1 = a;
    var num2 = b;
    val sum = num1 + num2;
    println("Sum =  $sum");
    return 0;
}

fun getName(name : String, firstname : String) = "$name $firstname"