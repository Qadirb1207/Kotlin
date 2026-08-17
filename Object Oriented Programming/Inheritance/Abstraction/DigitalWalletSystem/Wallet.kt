abstract class Wallet(private var holderName: String, private var walletId: String, private var balance: Double){
	init{
		if(balance < 0){
			println("Invalid balance!!!");
			this.balance = 0.0;
		}
	}
	abstract fun deposit(amount: Double);
	abstract fun withdraw(amount: Double);
	abstract fun wipeTotalSpent();
	abstract fun showHistory();
	
	public fun showDetails(){
		println("Holder name = ${this.holderName}");
		println("Wallet Id = ${this.walletId}");
		println("Balance = ${this.balance}");
	}
	
	public open fun getBalance(): Double{
		return this.balance;
	}
	
	public fun setBalance(amount: Double){
		if(amount > 0){
			this.balance = amount;
		}else{
			this.balance = 0.0;
		}
	}
	
	public fun getAccNo(): String{
		return this.walletId;
	}
	
	open public fun displayDetails(){
		println("Account Holder = ${this.holderName}");
		println("Account Number = ${this.walletId}");
		println("Balance = ${this.balance}");
	}
}
