fun main(){
	var arr = arrayOf(2, 8, 9, 22, 34, 2);
	
	var max = arr[0];
	for(i in arr){
		if(i > max){
			max = i;
		}
	}
	
	for(i in arr){
		print("$i \n");
	}
	println();
	println("Maximum element is: $max");
}
