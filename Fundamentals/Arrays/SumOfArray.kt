fun main(){
	var arr = arrayOf(12, 23, 34, 5);
	
	var sum = 0;
	for(i in arr){
		sum += i;
	}
	
	for(i in arr){
		print("$i \t");
	}
	println();
	println("Sum is : $sum");
}
