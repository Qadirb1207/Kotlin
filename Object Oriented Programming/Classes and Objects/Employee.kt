class Employee(var id: Int, var name: String, var sal: Double){
	fun showEmployee(){
		println("ID: ${this.id} \nname : ${this.name} \nsalary: ${this.sal}");
	}
}
