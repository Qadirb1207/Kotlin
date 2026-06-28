import java.util.Scanner
fun main(){
	val sc = Scanner(System.`in`)
	print("Enter a year = ")
	var year : Int = sc.nextInt()
	
	if(year in 2000..2100){
		println("Year is the part of 21st Century!!!")
	}else{
		println("Year is not the part of 21st Century!!!")
	}
	sc.close()
}
