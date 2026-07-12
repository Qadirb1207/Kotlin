import java.util.Scanner

fun main(){
	val sc = Scanner(System.`in`)
	print("Enter a number = ")
	var num: Int = sc.nextInt()
	println("Cube of $num is: ${cube(num)}")
	sc.close()
}

fun cube(num: Int): Int{
	return num*num*num;
}
