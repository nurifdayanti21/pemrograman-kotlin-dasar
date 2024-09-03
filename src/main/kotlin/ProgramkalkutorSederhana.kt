fun main(args: Array<String>) {
    //simple kalkulator
    println("Welcome to calculator")
    println("Enter the first Number: ")
    val a = readln()!!.toDouble()
    println("Enter the secomd number: ")
    val b = readln()!!.toDouble()
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quatient = a / b
    println("Sum: ${sum}")
    println("Difference: ${difference}")
    println("Product: ${product}")
    println("Quatient: ${quatient}")
    println("Thank You for using calculator.")
}