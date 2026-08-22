abstract class Character(private var name: String, protected var health: Int, protected var attackPower: Int){
	if(health > maxHealth){
		health = maxHealth;
	}
	abstract fun attack(target: Character);
	abstract fun defend(damage: Int);
	abstract fun specialAttack(target: Character);
	
	public fun isAlive(){
		return this.health > 0;
	}
} 
