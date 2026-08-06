fun main(){
	var emp: Employee = Employee("Qadir", 123000);
	var manager: Manager = Manager("Abrar", 134260, 12);
	var director: Director = Director("Masood", 132957, 23, "Finance");
	
	println("Employee Details: ");
	emp.displayDetails();
	
	println("\nManager Details: ");
	manager.displayDetails();
	manager.manageTeam();
	
	println("\nDirector Details: ");
	director.displayDetails();
	director.makeDecision();
}
