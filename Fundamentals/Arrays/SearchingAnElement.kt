import java.util.*;

fun main(){
	val arr = arrayOf(18, 19, 12, 2, 43, 4, 0);
	for(i in arr){
		print("$i \t");
	}
	println();
	val sc = Scanner(System.`in`)
	print("Enter the element you want to search from the above list = ");
	var key = sc.nextInt();
	
	linearSearch(arr, key);
}

fun linearSearch(arr: Array<Int>, key: Int){
	var found : Boolean = false;
	for((i, e) in arr.withIndex()){
		if(e == key){
			println("$key found at index $i in the list");
			found = true;
			break;
		}
	}
	if(!found){
		println("$key is not present in the array");
	}
}
