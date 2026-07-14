import java.util.Scanner;

fun main(){
	val sc = Scanner(System.`in`)
	print("Enter the size of array = ");
	var size = sc.nextInt()
	
	var array = IntArray(size);
	for(i in array.indices){
		print("Enter element no ${i+1} = ");
		array[i] = sc.nextInt();
	}
	
	println("Average of the array is ${average(array)}");
}

fun average(arr: IntArray): Float{
	var sum : Float = 0.0f;
	for(i in arr){
		sum += i;
	}
	
	return sum/arr.size;
}
