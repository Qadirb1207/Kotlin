open class Shape(private var name: String, private var length: Double, private var width: Double){

	constructor(name: String): this(name, 0.0, 0.0);
	
	
	open fun calculateArea() : Double{
		return this.length*this.width;
	}
	
	public fun getName(): String{
		return this.name;
	}
	
	open fun displayDetails(){
		println("Length = $length");
		println("Width = $width");
	}
}
