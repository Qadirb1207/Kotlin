import java.util.Random;
import java.util.Scanner;

fun showBattleMenu(){
	println("1. Normal Attack");
	println("2. Special Attack");
	println("3. Display Health");
	println("4. Display Character Status");
	println("5. Exit Battle");
}

fun main(){
	var rand = Random();
	var sc = Scanner(System.`in`);
	var randNum = rand.nextInt(3);
	var character: Character = null
	if(randNum == 0){
		character = Warrior("Warrior", 150, 25, 12); 
	}else if(randNum == 1){
		character = Mage("Mage", 100, 35, 100, 8);
	}else{
		character = Archer("Archer", 120, 30, 20, 10);
	}
	
	var userCharChoice = 0;
	var userChar: Character = null;
	do{
		println("===== SELECT YOUR CHARACTER =====");
		println("1. Warrior");
		println("2. Mage");
		println("3. Archer");
		println("4. Exit");
		print("\nEnter your choice = ");
		userCharChoice = sc.nextInt();
		
		when(userCharChoice){
			1 ->  {
					userChar = Warrior("Warrior", 150, 25, 12); 
					println("You selected Warrior\n");
				}
			
			2 ->  {
					userChar = Mage("Mage", 100, 35, 100, 8); 
					println("You selected Mage\n");
				}
			
			3 ->  {
					userChar = Archer("Archer", 120, 30, 20, 10); 
					println("You selected Archer\n");
				}
			
		}
	}while(userCharChoice != 4);
	
	if(userChar != null){
		var choice = 0;
		do{
			showBattleMenu();
			print("\nEnter your choice = ");
			choice = sc.nextInt();
			
			when(choice){
				1 ->  {
					
					}
			}
		}while(choice != 5)
	}
}
