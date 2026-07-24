class BankAccount public constructor(val accountNo: String, val accountHolderName: String, var balance:Double){

	constructor(accountNo:String, accountHolderName:String):this(accountNo, accountHolderName, 0.0)
	init{
		if(balance < 0){
			println("Invalid balance");
		}
		
		if(accountNo.length < 10){
			println("Invalid Account No");
		}
	}
	
	fun withdraw(amount: Int){
		if(amount > 0 && amount <= this.balance){
			this.balance -= amount;
			println("$amount rupees has been withdrawn from your account!! Current balance is: ${this.balance}"); 
		}else if(amount <= 0){
			println("Invalid amount!! Amount cannot be negative or zero!!");
		}else{
			println("Insufficient funds!! Current balance is : ${this.balance}");
		}
	}
	
	fun deposit(amount: Int){
		if(amount > 0){
			this.balance += amount;
			println("$amount rupees has been deposited to your account!!");
		}else{
			println("Invalid amount!! Amount cannot be negative or zero!!");
		}
	}
	
	fun transferTo(acc: BankAccount, amount: Int){
		if(amount > 0 && amount <= this.balance){
			this.withdraw(amount);
			acc.deposit(amount);
			
			println("$amount has been transfer to ${acc.accountHolderName}");
		}else if(amount <= 0){
			println("Invalid amount!! Amount cannot be negative or zero"); 
		}else{
			println("Insufficient funds!! Current balance is : ${this.balance}");
		}
	}
	
	fun showAccountDetails(){
		println("Account Number: ${this.accountNo} \nAccount Holder Name: ${this.accountHolderName} \nBalance: ${this.balance}");
	}
}

