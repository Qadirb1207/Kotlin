open class BankAccount(private var accountNumber: String, private var holderName: String, private var balance: Double){
	init{
		if(balance < 0.0){
			println("Invalid balance")
			this.balance = 0.0;
		}
	}
	
	public fun getBalance(): Double{
		return this.balance;
	}
	
	public fun setBalance(balance: Double){
		if(balance >= 0){
			this.balance = balance;
		}else{
			println("Invalid balance");
			this.balance = 0.0
		}
	}
	
	fun deposit(amount: Double){
		if(amount < 0.0){
			println("Invalid amount");
		}else{
			this.balance += amount;
			println("$amount rupees has been deposited in your account")
		}
	}
	
	fun withdraw(amount : Double){
		if(amount > 0 && amount <= this.balance){
			this.balance -= amount;
			println("$amount rupees has been withdrawn from your account")
		}else if(amount < 0){
			println("Invalid amount! Amount cannot be negative")
		}else{
			println("Insufficient amount! Your current balance is: ${this.balance}")
		}
	}
	
	open fun accountDetails(){
		println("Account Number = $accountNumber");
		println("Account Holder Name = $holderName");
		println("Balance = $balance");
	}
}
