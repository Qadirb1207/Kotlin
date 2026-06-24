fun main(){
	var year : Int = 2000;
	
	if((year % 100 == 0) && (year % 400 == 0)){
		println("It is a leap year")
	}else if((year % 100 != 0) && (year % 4 == 0)){
		println("It is a leap year")
	}else{
		println("It is not a leap year")
	}
}
