class Warrior(name: String, health: Int, attackPower: Int, private var armor: Int): Character(name, health, maxHealth, attackPower){
	override fun attack(target: Character){
		if(this.attackPower >= target.health){
			target.health = 0;
			println("${target.name} got $attackPower damage\n ${target.name} HP: ${target.health}");
			return;
		}else {
			target.health -= this.attackPower;
			println("${target.name} got $attackPower damage\n ${target.name} HP: ${target.health}");
		}
	}
	
	override fun defend(damage: Int){
		var actualAttack: Int = maxOf(0, this.armor - damage);
		if(actualAttack > this.health){
			this.health = 0;
			println("${this.name} got $actualAttack damage\n ${this.name} HP: ${this.health}");
			return;
		}else{
			this.health -= actualAttack;
			println("${this.name} got $actualAttack damage\n ${this.name} HP: ${this.health}");
		}
	}
	
	
}
