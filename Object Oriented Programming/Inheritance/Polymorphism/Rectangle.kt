class Rectangle(name: String, private var length: Double, private var width: Double): Shape(name, length, width){
	init{
		if(length <= 0){
			println("Invalid length! Length cannot be negative or zero! Setting length to zero");
			this.length = 0.0;
		}
		
		if(width <= 0){
			println("Invalid width! Width cannot be negative or zero! Setting width to zero");
			this.width = 0.0;
		}
		
		if(width > length){
			var temp: Double = length;
			length = width;
			width = temp;
		}
	}
	override fun calculateArea(): Double{
		return super.calculateArea();
	}
	
	override fun displayDetails(){
		println("Name of Shape = ${super.getName()}")
		super.displayDetails()
		println("Area of the ${super.getName()} = ${this.calculateArea()}");
	}
}
