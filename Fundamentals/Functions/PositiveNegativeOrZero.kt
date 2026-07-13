import java.util.Scanner

fun main(){
	val sc = Scanner(System.`in`)
	print("Enter a number = ")
	var num: Int = sc.nextInt()
	
	println("Number is: ${numberChecker(num)}")
	sc.close()
}

fun numberChecker(num: Int): String{
	if(num > 0){
		return "Positive"
	}else if(num < 0){
		return "Negative"
	}else{
		return "Zero"
	}
}
