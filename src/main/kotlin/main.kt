fun name(x: String, y: String){
    print("Please enter your name and phone number: ")
}

fun name(x: String, y: String, z: String){
    print("Please enter your business name, contact name and phone number: ")
}

fun main(){
    val a = name("Sarah", "555-5555")
    val b = name("Sarah", "Sarah", "555-5555")
    println(a)
    println(b)
}