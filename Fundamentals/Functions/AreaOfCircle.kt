import java.util.Scanner

fun main(){
	val sc = Scanner(System.`in`)
	print("Enter the radius of a circle = ")
	var radius : Float = sc.nextFloat()
	println("Area of the circle of radius $radius is: ${areaOfCircle(radius)}")
	sc.close()
}

fun areaOfCircle(radius: Float, pi: Double = 3.14159265358979): Double{
	if(radius > 0)
		return radius * radius * pi
	else{
		println("Invalid Radius! Radius cannot be negative!!")
		return 0.0;
	}
}
