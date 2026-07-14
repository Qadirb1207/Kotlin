import java.util.Scanner

fun main(){
	val sc = Scanner(System.`in`)
	print("Enter the principal amount = ")
	var principal = sc.nextInt()
	print("Enter the interest rate = ")
	var rate = sc.nextInt()
	print("Enter the total time (in years) = ")
	var time = sc.nextInt()
	
	println("Total interest is: ${simpleInterest(principal, rate, time)}")
	sc.close()
}

fun simpleInterest(principal : Int, rate : Int, time : Int) : Float{
	var interest : Float= (principal*rate*time)/100.0f
	return interest
}
