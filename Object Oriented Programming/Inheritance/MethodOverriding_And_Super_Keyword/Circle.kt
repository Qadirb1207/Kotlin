class Circle(name: String, private var radius: Double): Shape(name){

	override fun calculateArea(): Double{
		return this.radius*this.radius*Math.PI;
	}
	
	override fun displayDetails(){
		println("Name of Shape = ${super.getName()}");
		println("Radius of the ${super.getName()} = $radius");
		println("Area of the ${super.getName()} = ${this.calculateArea()}");
	}
}
