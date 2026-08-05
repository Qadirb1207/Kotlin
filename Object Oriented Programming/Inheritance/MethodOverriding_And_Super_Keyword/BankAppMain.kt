fun main(){
	var account = SavingsAccount("2321212323", "Qadir Bakhsh", 560.0, 7);
	account.accountDetails()
	
	account.withdraw(340.5);
	println()
	println();
	println("Total interest is: ${account.calculateInterest()}")
	
}
