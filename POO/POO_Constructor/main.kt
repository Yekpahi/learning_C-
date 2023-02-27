fun main() {
    val arr = arrayOf(1, 2, 4,);

    println(arr.size)
    println(arr[0])
}

class Person (name : String, age : Int) {

    fun present() {
        val pr = "${name}  + $age";
       println(pr); 
    }
}