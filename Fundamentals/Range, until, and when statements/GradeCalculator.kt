import java.util.Scanner;

fun main(){
	val sc = Scanner(System.`in`)
	
	print("Enter your Marks = ")
	val marks = sc.nextInt();
	
	if(marks >= 0 && marks <= 100){
		when(marks){
			in 90..100 -> println("Grade is: A")
			in 80..89 -> println("Grade is: B")
			in 70..79 -> println("Grade is: C")
			in 60..69 -> println("Grade is: D")
			else -> println("Grade is: F")
		}
	}else{
		println("Invalid Marks!!!")
	}
	sc.close()
}
