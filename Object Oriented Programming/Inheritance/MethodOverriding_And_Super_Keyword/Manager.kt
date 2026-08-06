open class Manager(name: String, salary: Int, private var teamSize: Int): Employee(name, salary){
	override fun displayDetails(){
		super.displayDetails();
		println("Team size = $teamSize");
	}
	
	public fun manageTeam(){
		println("${super.getName()} manages a team of $teamSize people");
	}
}
