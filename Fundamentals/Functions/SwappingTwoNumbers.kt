import java.util.Scanner
fun main(){
	val sc = Scanner(System.`in`)
	print("Enter first number = ")
	var num1 = sc.nextInt()
	print("Enter second number = ")
	var num2 = sc.nextInt()
	
	swap(num1, num2)
}

fun swap(num1: Int,  num2: Int){
	println("Before swapping:\n first = $num1 \n second = $num2")
	
	println("After swapping:\n first = $num2 \n second = $num1")
}
