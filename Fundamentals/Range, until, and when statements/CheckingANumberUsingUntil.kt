import java.util.Scanner
fun main(){
	val sc = Scanner(System.`in`)
	print("Enter a number = ")
	var num : Int = sc.nextInt()
	
	if(num in  1 until 10){
		println("Number is in the range from 1 until 10")
	}else{
		println("Number is not in the range from 1 until 10")
	}
	sc.close()
}
