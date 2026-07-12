import java.util.Scanner
fun main(){
	val sc = Scanner(System.`in`)
	print("Enter the temperature in Fahrenheit = ")
	var temp : Float = sc.nextFloat()
	println("$temp Fahrenheit = ${celsius(temp)}")
	sc.close()
}
fun celsius(temp: Float): Float{
	var cel = ((temp-32)*5)/9
	return cel
}
