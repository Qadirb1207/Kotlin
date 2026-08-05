class SavingsAccount(accountNumber: String, holderName: String, balance: Double, private var interestRate: Int): BankAccount(accountNumber, holderName, balance){
	init{
		if(balance < 0.0){
			println("Invalid balance")
			super.setBalance(0.0);
		}
	}
	
	init{
		if(interestRate < 0){
			println("Interest rate cannot be negative")
			interestRate = 0;
		}
	}
	fun calculateInterest(): Double{
		var interest: Double = (super.getBalance()*interestRate)/100;
		return interest;
	}
	
	override fun accountDetails(){
		super.accountDetails();
		println("Interest Rate = $interestRate")
	}
}
