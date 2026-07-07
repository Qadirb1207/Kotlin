import java.util.Scanner

fun main(){
	val sc = Scanner(System.`in`)
	print("Enter a number = ")
	var num = sc.nextInt()
	
	for(i in num downTo 1 ){
		println(i)
	}
	
	sc.close()
}
