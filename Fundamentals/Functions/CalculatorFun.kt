import java.util.Scanner

fun main(){
	val sc = Scanner(System.`in`)
	print("Enter a number = ")
	var num1 = sc.nextInt()
	print("Enter another number = ")
	var num2 = sc.nextFloat()
	print("Enter an operator (+, -, *, /) = ")
	var op = sc.next()[0]
	
	calculator(num1, num2, op)
	sc.close()
}

fun calculator(num1 : Int , num2 : Float, op : Char){
	when(op){
		'+' -> println("$num1 + $num2 = ${num1+num2}")
		'-' -> println("$num1 - $num2 = ${num1-num2}")
		'*' -> println("$num1 * $num2 = ${num1*num2}")
		'/' -> if(num2 != 0.0f) println("$num1 / $num2 = ${num1/num2}") else println("Division by $num2 not possible")
		else -> println("Invalid operator")
	}
}
