class PersonalWallet(holderName: String, accountNo: String, balance: Double): Wallet(holderName, accountNo, balance){
	
	private var transactions = mutableListOf<String>();
	private val dailyLimit: Double = 50000.0;
	private var totalSpent: Double = 0.0;
	override fun withdraw(amount: Double){
		if(amount > 0 && amount <= super.getBalance() && totalSpent <= dailyLimit){
			totalSpent += amount;
			var bal = super.getBalance() - amount;
			super.setBalance(bal);
			println("$amount rupees has been withdrawn from your account");
			transactions.add("$amount has been withdrawn into your account");
		}else if(amount <= 0){
			println("Invalid amount! Amount cannot be negative or zero!!");
		}else if(amount > super.getBalance()){
			println("Insufficient amount!");
		}else{
			println("Limit exceeded! Cannot withdraw more!");
		}
	}
	
	override fun deposit(amount: Double){
		if(amount > 0){
			var balance = super.getBalance()+amount;
			super.setBalance(balance); 
			println("$amount has been deposited into your account");
			transactions.add("$amount has been deposited into your account");
		}else if(amount < 0){
			println("Invalid amount!")
		}else{
			println("Limit completed! Cannot withdraw more!!");
		}
	}
	
	override fun getBalance(): Double{
		return super.getBalance();
	}
	
	override fun showHistory(){
		println("========= History ========");
		println(this.transactions);
	}
	
	override public fun displayDetails(){
		super.displayDetails();
		println("Daily Limit = ${this.dailyLimit}")
		println("Total Spent = ${this.totalSpent}")
		println("Enter 7 in Main Menu Input to make the total spent amount back to zero")
	}
	
	override fun wipeTotalSpent(){
		this.totalSpent = 0.0;
	}
}
