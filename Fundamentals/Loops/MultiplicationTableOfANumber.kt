import java.util.Scanner
fun main(){
	val sc = Scanner(System.`in`)
	print("Enter a number = ")
	var number = sc.nextInt()
	
	var last : Int = 10
	for(i in 1..last){
		println("$i x $number = ${number*i}")
	}
	
	sc.close()
}
