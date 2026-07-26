class BankAccount(var holderName: String,var accountNumber: String, var balance: Int){	

	constructor(holderName: String, accountNumber: String): this(holderName, accountNumber, 0);
	init{
		if(holderName.isBlank()){
			println("Name cannot be empty")
		}
	}
	
	init{
		if(accountNumber.isBlank()){
			println("Account Number cannot be empty");
		}
	}
	init{
		if(balance < 0){
			println("Invalid balance")
		}else{
			this.balance = balance
		}
	}
	
	
	
	
	fun withdraw(amount: Int){
		if(amount > 0 && amount <= balance){
			balance -= amount;
			println("$amount rupees has been withdrawn from your account");
		}else if(amount < 0){
			println("Amount cannot be negative!!")
		}else{
			println("Insufficient amount! Your current balance is ${this.balance}")
		}
	}
	
	fun deposit(amount: Int){
		if(amount > 0){
			balance += amount;
			println("$amount rupees has been deposited in your account")
		}else{
			println("Invalid amount")
		}
	}
	
	fun displayDetails(){
		println("Name: $holderName")
		println("Account Number : $accountNumber")
		println("Balance: $balance");
	}
}
