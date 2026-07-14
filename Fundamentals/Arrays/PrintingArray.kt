fun main(){
	val array = arrayOf(19, 10, 13, 13)
	
	for(i in array){
		print("$i \t")
	}
	println()
	for((i, e) in array.withIndex()){
		println(e);
	}
}
