import java.util.Scanner

fun main(){
	val sc = Scanner(System.`in`)
	
	print("Enter a number = ")
	var num = sc.nextInt()
	
	var sum : Int = 0
	
	for(i in 1..num){
		sum += i
	}
	println("Sum of numbers from 1 till $num is: $sum")
	
	sc.close()
}
