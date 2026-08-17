class BusinessWallet(holderName: String, walletId: String, balance: Double): Wallet(holderName, walletId, balance){
	private var transactions = mutableListOf<String>();
	private val dailyLimit: Double = 200000.0;
	private var totalSpent: Double = 0.0;
	
	override fun withdraw(amount: Double){
		if(amount > 0 && amount <= super.getBalance() && totalSpent <= dailyLimit){
			totalSpent += amount;
			val balance: Double = super.getBalance()-amount;
			super.setBalance(balance);
			println("$amount has been withdrawn from your account");
			transactions.add("$amount has been withdrawn from your account");
		}else if(amount > super.getBalance()){
			println("Insufficient balance");
		}else if(amount <= 0){
			println("Invalid amount! Amount cannot be negative or zero!!");
		}else{
			println("Limit exceeded! Cannot withdraw more!");
		}				
	}
	
	override fun deposit(amount: Double){
		if(amount > 0){
			val balance: Double = super.getBalance()+amount;
			super.setBalance(balance);
			println("$amount has been deposited in your account");
			transactions.add("$amount has been deposited in your account");
		}else{
			println("Invalid amount");
		}
	}
	
	override fun showHistory(){
		println("========= History ========");
		println(transactions);
	}
	
	
	override public fun displayDetails(){
		super.displayDetails();
		println("Daily Limit = ${this.dailyLimit}")
		println("Total Spent = ${this.totalSpent}")
		println("Enter 7 in Main Menu Inputto make the total spent amount back to zero")
	}
	
	override fun wipeTotalSpent(){
		this.totalSpent = 0.0;
	}
}
