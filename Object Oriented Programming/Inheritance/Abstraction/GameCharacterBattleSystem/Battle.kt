class Battle(private var player1: Character, private var player2: Character){
	public fun startBattle(){
		while(player1.isAlive() && player2.isAlive()){
			player1.attack(player2);
			if(player2.isAlive()){
				player2.attack(player1);
			}else{
				break;
			}
		}
	}
}
