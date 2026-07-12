import java.util.Scanner;

fun main(){
	val sc = Scanner(System.`in`)
	print("Enter your name = ")
	val name = sc.nextLine()
	
	printGreeting(name)
	
	sc.close()
	
}

fun printGreeting(name: String){
	println("Hello $name")
}
