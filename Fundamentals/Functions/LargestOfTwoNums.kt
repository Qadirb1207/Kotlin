import java.util.Scanner
fun main(){
	val sc = Scanner(System.`in`)
	print("Enter first number = ")
	var num1 : Int = sc.nextInt()
	print("Enter second number = ")
	var num2: Int = sc.nextInt()
	
	println("Largest Number is : ${largest(num1, num2)}")
}

fun largest(num1: Int, num2 : Int) : Int{
	if(num1 > num2){
		return num1
	}else if(num2 > num1){
		return num2;
	}else{
		println("Both are equal")
		return Integer.MAX_VALUE;
	}
}
