open class Employee(private var name: String, private var salary: Int){
	open fun displayDetails(){
		println("Name = $name");
		println("Salary = $salary");
	}
	
	public fun getName(): String{
		return this.name;
	}
}
