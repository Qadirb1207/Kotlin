class Mage(name: String, health: Int, attackPower: Int, private var mana: Int, private var shieldPower: Int): Character(name, health, maxHealth, attackPower){
	override fun attack(target: Character){
		if(mana >= 10){
			if(attackPower > target.health){
				target.health = 0;
				println("${target.name} got $attackPower damage\n ${target.name} HP: ${target.health}");
			}else{
				target.health -= attackPower;
				println("${target.name} got $attackPower damage\n ${target.name} HP: ${target.health}");
			}
			this.mana -= 10;
		}else{
			println("Don't have enough mana to attack!!");
		}
	}
	
	override fun defend(damage: Int){
		var actualAttack = maxOf(0, shieldPower - damage);
		if(actualAttack > this.health){
			this.health = 0;
			println("${this.name} got $actualAttack damage\n ${this.name} HP: ${this.health}");
		}else{
			this.health -= actualAttack;
			println("${this.name} got $actualAttack damage\n ${this.name} HP: ${this.health}");
		}
	}
	
	override fun specialAttack(target: Character){
		if(mana >= 30){
			tar.health -= (2*this.attackPower);
			mana -= 30;
			println("${target.name} got $attackPower damage\n ${target.name} HP: ${target.health}");
		}else{
			println("Not enough mana to use Fireball!");
		}
	}
	
}
