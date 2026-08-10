fun main(){
	var arr = arrayOf(Rectangle("Rectangle", 4.5, 2.3), Circle("Circle", 12.5), Triangle("Triangle", 14.4, 12.5));
	
	for(obj in arr){
		println("Area is: ${obj.calculateArea()}");
		
		println();
		
		obj.displayDetails();
		
		println();
		println();
		
	}
}
