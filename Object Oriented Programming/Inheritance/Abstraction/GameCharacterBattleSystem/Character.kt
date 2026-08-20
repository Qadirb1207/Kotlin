abstract class Character(private var name: String, protected var health: Int, protected var maxHealth: Int, protected var attackPower: Int){
	abstract fun attack(target: Character);
	abstract fun defend(damage: Int);
	
	public fun isAlive(){
		return this.health > 0;
	}
} 
