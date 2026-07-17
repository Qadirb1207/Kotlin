class Rectangle(var length: Double, var width: Double){
	fun showDim(){
		if(length > width){
			println("Length: $length \nWidth: $width");
		}else{
			println("Length: $width \nWidth: $length");
		}
	}
	
	fun area(): Double{
		return this.length*this.width;
	}
	
	fun perimeter():Double{
		return 2*(this.length+this.width);
	}
}
