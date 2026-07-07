import java.util.Scanner

fun main(){
	val input = Scanner(System.`in`)
	
	print("Enter a number = ")
	var num = input.nextInt()
	
	for(i in 1..num){
		println(i)
	}
	
	sc.close()
}
