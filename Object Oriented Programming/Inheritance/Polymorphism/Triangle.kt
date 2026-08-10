class Triangle(name:String, private var base: Double, private var height: Double): Shape(name){
	override fun calculateArea():Double{
		return 1/2.0 * base*height;
	}
	
	override fun displayDetails(){
		println("Name of Shape = ${super.getName()}");
		println("Base of the ${super.getName()} = $base");
		println("Height of the ${super.getName()} = $height");
		println("Area of the ${super.getName()} = ${this.calculateArea()}");
	}
}
