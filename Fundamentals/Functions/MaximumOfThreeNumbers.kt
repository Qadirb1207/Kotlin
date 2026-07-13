import java.util.Scanner

fun main(){
	val sc = Scanner(System.`in`)
	print("Enter first number = ")
	var num1 = sc.nextInt()
	print("Enter second number = ")
	var num2 = sc.nextInt()
	print("Enter third number = ")
	var num3 = sc.nextInt()
	
	println("Largest of the three is: ${largest(num1, num2, num3)}")
	sc.close()
}

fun largest(num1:Int, num2: Int, num3: Int) : Int{
	if(num1 > num2 && num1 > num3){
		return num1
	}else if(num2 > num3){
		return num2
	}else{
		return num3
	}
}
