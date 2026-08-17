import java.util.Scanner;

fun printAccountNumbers(array: Array<Wallet>){
	var i = 0;
	for(wallet in array){
		println("${i+1}.  ${wallet.getAccNo()}");
		++i;
	}
}

fun main(){
	val sc = Scanner(System.`in`);
	var wallets = arrayOf(PersonalWallet("Qadir Bakhsh", "1234223442", 0.0), PersonalWallet("Abrar Ahmed", "1234223432", 0.0), BusinessWallet("Qadir Bakhsh", "5437228981", 1200.0), BusinessWallet("Abrar Ahmed", "5437228929", 1200.0));
	
	var choice = 0;
	var i = 0;
	do{
		println("========== Welcome to All In One Banking System ==========");
		println("1. Deposit")
		println("2. Withdraw")
		println("3. Check Balance")
		println("4. Transaction History")
		println("5. Display Wallet Details")
		println("6. Exit")
		
		print("\nEnter your choice = ");
		choice = sc.nextInt();
		
		when(choice){
			1 -> {
					do{
						println("====== SELECT ACCOUNT FROM FOLLOWING ACCOUNT NUMBERS =====");
						printAccountNumbers(wallets);
						println("5.  Back");
						
						print("\n Enter your choice = ")
						i = sc.nextInt();
						if(i > 0 && i < 5){
							break;
						}else{
							continue;
						}
					}while(i != 5)
					if( i < 5){
						print("Enter amount to deposit =");
						var amt = sc.nextDouble();
						wallets[i-1].deposit(amt);
						println();
						i = 0;
					}else{
						i = 0;
						continue;
					}
						
				}
			2 -> {
					if(i == 0){
						do{
							println("====== SELECT ACCOUNT FROM FOLLOWING ACCOUNT NUMBERS =====");
							printAccountNumbers(wallets);
							println("5.  Back");
							
							print("\n Enter your choice = ")
							i = sc.nextInt();
							if(i > 0 && i < 5){
								break;
							}else{
								continue;
							}
						}while(i != 5)
					}
					if( i < 5){
						print("Enter the amount to withdraw = ");
						var amt = sc.nextDouble();
						wallets[i-1].withdraw(amt);
						println();
						i = 0;
					}else{
						i = 0;
						continue;
					}
						
				}
			
			3 -> {
					if(i == 0){
						do{
							println("====== SELECT ACCOUNT FROM FOLLOWING ACCOUNT NUMBERS =====");
							printAccountNumbers(wallets);
							println("5.  Back");
							
							print("\n Enter your choice = ")
							i = sc.nextInt();
							if(i > 0 && i < 5){
								break;
							}else{
								continue;
							}
						}while(i != 5)
					}
					if( i < 5){
						println();
						println("Your current balance is = ${wallets[i-1].getBalance()}");
						println();
						i = 0;
					}else{
						i = 0;
						continue;
					}
				}
			
			4 -> {
					if(i == 0){
						do{
							println("====== SELECT ACCOUNT FROM FOLLOWING ACCOUNT NUMBERS =====");
							printAccountNumbers(wallets);
							println("5.  Back");
							
							print("\n Enter your choice = ")
							i = sc.nextInt();
							if(i > 0 && i < 5){
								break;
							}else{
								continue;
							}
						}while(i != 5)
					}
					if( i < 5){
						println();
						wallets[i-1].showHistory();
						println();
						i = 0;
					}else{
						i = 0;
						continue;
					}
					
				}
			
			5 -> {
					if(i == 0){
						do{
							println("====== SELECT ACCOUNT FROM FOLLOWING ACCOUNT NUMBERS =====");
							printAccountNumbers(wallets);
							println("5.  Back");
							
							print("\n Enter your choice = ")
							i = sc.nextInt();
							if(i > 0 && i < 5){
								break;
							}else{
								continue;
							}
						}while(i != 5)
					}
					if( i < 5){
						println();
						wallets[i-1].displayDetails();
						println();
						i = 0;
					}else{
						i = 0;
						continue;
					}
					
				}
			
			7 -> {
					if(i == 0){
						do{
							println("====== SELECT ACCOUNT FROM FOLLOWING ACCOUNT NUMBERS =====");
							printAccountNumbers(wallets);
							println("5.  Back");
							
							print("\n Enter your choice = ")
							i = sc.nextInt();
							if(i > 0 && i < 5){
								break;
							}else{
								continue;
							}
						}while(i != 5)
					}
					if( i < 5){
						wallets[i-1].wipeTotalSpent();
						println("Your total spent has become 0.0 successfully!!\n");
						i = 0;
					}else{
						i = 0;
						continue;
					}
				  
				}
		}
		
	}while(choice != 6);
	
	println("========== THANKS FOR USING OUR SERVICES!!! ==========");
}
