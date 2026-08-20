class Warrior(name: String, health: Int, maxHealth: Int, attackPower: Int, private var armor: Int): Character(name, health, maxHealth, attackPower){
	override fun attack(target: Character){
		if(this.attackPower >= target.health){
			target.health = 0;
			return;
		}else {
			target.health -= this.attackPower;
		}
	}
	
	override fun defend(damage: Int){
		var actualAttack: Int = this.armor - damage;
		if(actualAttack > this.health){
			this.health = 0;
			return;
		}else{
			this.health -= actualAttack;
		}
	}
}
