import java.util.Scanner;
fun main(){
	val account = BankAccount("Abrar Ahmed", "23321221212");
	val sc = Scanner(System.`in`)
	var choice = 0
	do{
		println("1. Deposit");
		println("2. Withdraw");
		println("3. Check Balance");
		println("4. Display Details");
		println("5. Exit");
		
		print("\n Enter your choice = ")
		choice = sc.nextInt()
		
		when(choice){
			1 -> {print("Enter Amount to deposit = ")
					var amount = sc.nextInt()
					account.deposit(amount)
				}
		
		       2 ->  {
				print("Enter amount to withdraw = ")
				var amount = sc.nextInt()
				account.withdraw(amount)
		       		}
		       		
		      3 ->   {
		    		println("Your current balance is: ${account.balance}");
		    		}
		    	
		     4 ->   {
		    		account.displayDetails()
		    		}
		    		
		     5 -> break
		     
		     6 -> continue;
			
				
				
		}
	}while(choice != 5)
}
