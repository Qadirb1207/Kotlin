import java.util.Scanner

fun main(){
	val sc = Scanner(System.`in`)
	print("Enter a number = ")
	var num = sc.nextInt()
	var fact : Int = 1
	
	for(i in num downTo 1){
		fact *= i
	}
	
	println("$num!  = $fact")
	
	sc.close()
}
