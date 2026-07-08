import java.util.Scanner

fun main(){
	val pin : String = "Password786"
	val sc = Scanner(System.`in`)
	print("Enter the pin = ")
	var enteredPin : String = sc.nextLine()
	while(!enteredPin.equals(pin)){
		print("Enter the pin = ")
		enteredPin = sc.nextLine()
	}
	sc.close()
}
