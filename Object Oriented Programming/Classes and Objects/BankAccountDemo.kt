fun main(){
	val acc = BankAccount("123456789003", "Abrar Ahmed", 1200.0);
	val acc2 = BankAccount("23332112122", "Qadir Bakhsh");
	println("======= Account 1 =======");
	acc.showAccountDetails();
	println("======= Account 2 =======");
	acc2.showAccountDetails();
	
	acc.transferTo(acc2, 200);
	println("\n\nAfter Transferring some amount from account 1 to account 2\n\n");
	println("======= Account 1 =======");
	acc.showAccountDetails();
	println("======= Account 2 =======");
	acc2.showAccountDetails();
	
}
