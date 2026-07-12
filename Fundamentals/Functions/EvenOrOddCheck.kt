import java.util.Scanner

fun main(){
	val sc = Scanner(System.`in`)
	print("Enter a number =  ")
	var num : Int = sc.nextInt()
	println("The number is ${isEvenOrOdd(num)}")

}

fun isEvenOrOdd(num : Int) : String{
	if(num%2 == 0){
		return "Even"
	}else{
		return "Odd"
	}
}
