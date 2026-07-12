import java.util.Scanner

fun main(){
	val sc = Scanner(System.`in`)
	print("Enter your age = ")
	var age: Int = sc.nextInt()
	
	println("You are ${isEligible(age)} to vote")
	sc.close()
}

fun isEligible(age: Int): String{
	if(age <= 0){
		println("Invalid age")
		return ""
	}else if( age >= 18){
		return "Eligible"
	}else{
		return "Not Eligible"
	}
}
