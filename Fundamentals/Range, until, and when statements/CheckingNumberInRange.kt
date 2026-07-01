import java.util.Scanner;
fun main(){
	val input = Scanner(System.`in`);
	print("Enter a number = ")
	val num : Int = input.nextInt()

	if(num in 1..100){
		println("Number is in the range 1 to 100")
	}else{
		println("Number isn't in the range 1 to 100")
	}
}
