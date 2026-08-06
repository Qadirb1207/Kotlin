class Director(name: String, salary: Int, teamSize: Int, private var department: String): Manager(name, salary, teamSize){
	override fun displayDetails(){
		super.displayDetails();
		println("Department = $department");
	}
	
	fun makeDecision(){
		println("${super.getName()} makes a decision");
	}
}
