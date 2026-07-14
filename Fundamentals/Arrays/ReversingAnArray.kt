fun main(){
	val array = arrayOf(12, 13, 78, 98, 100);
	println("Original Array: ");
	for(i in array){
		print("$i \t");
	}
	println();
	reverse(array);
	println("After reversing: ");
	for(i in array){
		print("$i \t");
	}
	println()
}

fun reverse(arr: Array<Int>){
	for(i in 0 until arr.size/2){
		var temp = arr[i];
		arr[i] = arr[arr.size-i-1];
		arr[arr.size-i-1] = temp;
	}
}
