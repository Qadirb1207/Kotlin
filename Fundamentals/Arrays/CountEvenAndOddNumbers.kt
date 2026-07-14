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
	
	countEvenAndOdd(array);
}

fun countEvenAndOdd(arr: IntArray){
	var evens = 0;
	var odds = 0;
	for(i in arr){
		if(i%2 == 0){
			++evens;
		}else{
			++odds;
		}
	}
	
	println("Total even numbers = $evens \nTotal odd numbers = $odds")
}
