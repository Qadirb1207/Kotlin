import java.util.Scanner
fun main(){
	val sc = Scanner(System.`in`)
	print("Enter a number = ")
	var num: Int = sc.nextInt()
	
	println("Square of $num is: ${squareOf(num)}")
}

fun squareOf(num: Int): Int{
	return num*num
}
