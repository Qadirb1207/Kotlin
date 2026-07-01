import java.util.Scanner
fun main(){
	val input = Scanner(System.`in`)
	print("Enter a character = ")
	var ch : Char = input.nextLine()[0]
	
	if(ch in 'a' .. 'z'){
		println("The character is a letter of small English alphabet")
	}else{
		println("The character is not a letter of small English alphabet")
	}
}
