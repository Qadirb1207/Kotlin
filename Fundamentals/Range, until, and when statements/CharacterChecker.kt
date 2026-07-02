import java.util.Scanner

fun main(){
	val input = Scanner(System.`in`)
	
	print("Enter a Character = ")
	var ch : Char = input.next()[0]
	
	when(ch){
		in 'a'..'z' -> println("Lowercase")
		in 'A'..'Z' -> println("Uppercase")
		in '0'..'9' -> println("Digit")
		else -> println("Special Character")
	}
	
	input.close()
}
