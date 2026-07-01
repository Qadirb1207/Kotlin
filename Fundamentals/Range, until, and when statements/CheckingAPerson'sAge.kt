import java.util.Scanner
fun main(){
	val input = Scanner(System.`in`)
	print("Enter a number = ")
	var age : Int = input.nextInt()
	
	if(age in 18..65){
		println("you can vote")
	}else{
		println("you cannot vote")
	}
}
