import java.util.Scanner

fun main(){
	val sc = Scanner(System.`in`)
	print("Enter the number of a day of a week = ")
	var num : Int = sc.nextInt()
	
	if(num >= 1 && num <= 7){
		when(num){
			1 -> println("Sunday")
			2 -> println("Monday")
			3 -> println("Tuesday")
			4 -> println("Wednesday")
			5 -> println("Thursday")
			6 -> println("Friday")
			else -> println("Saturday")
		}
	}else{
		println("Invalid number of a day of a week")
	}
}
