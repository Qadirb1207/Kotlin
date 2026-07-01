import java.util.Scanner
fun main(){
	val sc = Scanner(System.`in`)
	print("Enter marks of student = ")
	var marks : Int = sc.nextInt()
	if(marks in 0..100){
		println("Marks are valid!!!")
	}else{
		println("Marks are invalid!!")
	}
}
