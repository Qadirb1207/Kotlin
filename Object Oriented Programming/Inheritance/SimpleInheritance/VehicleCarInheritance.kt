open class Vehicle(var brand: String, var speed: Int){
	constructor(): this("none", 0);
	
	
	init{
		if(speed < 0){
			println("Speed cannot be negative")
			this.speed = 0;
		}
	}
	
	fun start(){
		println("Vehicle starts");
	}
	
	fun stop(){
		println("Vehicle stops");
	}
}

class Car(brand: String, speed: Int, var fuelType: String) : Vehicle(brand, speed){
	
	constructor(): this("None", 0, "None");
	
	init{
		if(fuelType.isBlank()){
			println("Invalid fuel type");
		}
	}
	
	fun openTrunk(){
		println("Trunk is open");
	}
	
	fun display(){
		println("Brand: $brand")
		println("Speed: $speed")
		println("Fuel Type: $fuelType");
	}
}

fun main(){
	var myCar = Car("Suzuki",120, "Petrol");
	//myCar.brand  = "Suzuki"
	//myCar.speed = 120
	
	myCar.display()
	
}
