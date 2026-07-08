import java.util.Scanner

fun main(){
	val sc = Scanner(System.`in`)
	print("Enter a number = ")
	var n = sc.nextInt()
	
	for(i in 1..n){
		if(i%2 != 0){
			println(i)
		}
	}
	sc.close()
}
