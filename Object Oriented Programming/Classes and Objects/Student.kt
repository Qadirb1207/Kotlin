class Student(var name: String, var rollNo: Int, var age: Int){

	fun printDetails(){
		println("Name: $name");
		println("Age: ${this.age}");
		println("Roll Number: ${this.rollNo}");
	}
}
