import java.util.Scanner
fun main(){
	val sc = Scanner(System.`in`)
	var choice = 0;
	do{
		println("1. Add")
		println("2. Subtract")
		println("3. Multiply")
		println("4. Divide")
		println("5. Exit")
		print("\n Choice = ")
		choice = sc.nextInt()
		
		when(choice){
			1 -> add()
			2 -> subtract()
			3 -> multiply()
			4 -> divide()
			5 -> break
			else -> println("\nInvalid Choice\n")
		}
	}while(choice!= 5)
}

fun add(){
	val sc = Scanner(System.`in`)
	
	print("Enter a number = ")
	var num1 = sc.nextInt()
	print("Enter a number = ")
	var num2 = sc.nextInt()
	
	println("$num1 + $num2 = ${num1+num2}")
	sc.nextLine()
	
}

fun subtract(){
	val sc = Scanner(System.`in`)
	
	print("Enter a number = ")
	var num1 = sc.nextInt()
	print("Enter a number = ")
	var num2 = sc.nextInt()
	
	println("$num1 - $num2 = ${num1-num2}")
	sc.nextLine()
	
}

fun multiply(){
	val sc = Scanner(System.`in`)
	
	print("Enter a number = ")
	var num1 = sc.nextInt()
	print("Enter a number = ")
	var num2 = sc.nextInt()
	
	println("$num1 * $num2 = ${num1*num2}")
	sc.nextLine()
	
}

fun divide(){
	val sc = Scanner(System.`in`)

	print("Enter a number = ")
	var num1 = sc.nextInt()
	print("Enter a number = ")
	var num2 = sc.nextFloat()
	
	if(num2 == 0.0f){
		println("Division by $num2 is not possible!!!")
		return
	}else{
		println("$num1 / $num2 = ${num1/num2}")
	}
	sc.nextLine()
	
}
