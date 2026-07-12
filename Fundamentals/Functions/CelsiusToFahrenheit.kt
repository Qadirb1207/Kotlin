import java.util.Scanner
fun main(){
	val sc = Scanner(System.`in`)
	print("Enter the temperature in Celsius = ")
	var temp: Float = sc.nextFloat()
	println("$temp Celsius = ${fahrenheit(temp)}")
	sc.close()
	
}
fun fahrenheit(temp: Float): Float{
	var fah : Float = (temp*9)/5+32
	return fah;
}
