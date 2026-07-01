import java.util.Scanner
fun main(){
	val sc = Scanner(System.`in`)
	print("Enter the number of the month of the year = ")
	var month : Int = sc.nextInt()
	if(month >= 1&& month <= 12){
		when(month){
			1 -> println("Muharram Ul Harram")
			2 -> println("Safar Ul Musaffar")
			3 -> println("Jamadi AL Awal")
			4 -> println("Jamadi As Sani")
			5 -> println("Rabia Al Awal")
			6 -> println("Rabia As Sani")
			7 -> println("Rajab Ul Murajjab")
			8 -> println("Sha'aban UL Muazzam")
			9 -> println("Ramazan Ul Mubarak")
			10 -> println("Shawal Ul Mukaram")
			11 -> println("ZelQa'ad")
			else -> println("Ze AL Hajj")
		}
	}else{
		println("Invalid month number")
	}
}
