import java.util.Scanner
fun main(){
	val sc = Scanner(System.`in`)
	print("Enter a number = ")
	var num1 : Int = sc.nextInt()
	print("Enter another number = ")
	var num2: Int = sc.nextInt()
	
	println("$num1 + $num2 = ${add(num1, num2)}")
	sc.close()
}

fun  add(num1: Int, num2: Int) : Int {
	return num1+num2
}
