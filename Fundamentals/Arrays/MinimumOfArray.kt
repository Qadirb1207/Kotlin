fun main(){
	var arr = arrayOf(12, 39, 34, 20, 52);
	
	var min = arr[0];
	for(i in arr){
		if(i < min){
			min = i;
		}
	}
	
	for(i in arr){
		print("$i \t");
	}
	println()
	println("Minimum element is: $min");
	
}
