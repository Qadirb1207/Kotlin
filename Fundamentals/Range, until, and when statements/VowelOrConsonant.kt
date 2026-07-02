import java.util.Scanner

fun main(){
	val input = Scanner(System.`in`)
	
	print("Enter an Alphabet: ")
	var ch : Char = input.next()[0]
	
	val isVowel: Boolean = ch == 'a' || ch=='e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||ch == 'O' || ch == 'U'
	if(ch in 'a'..'z' || ch in 'A'..'Z'){
		when(isVowel){
			true -> println("Vowel")
			else -> println("Consonant")
		}
	}else{
		println("Invalid Character")
	}
}
