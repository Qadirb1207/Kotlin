class Archer(name: String, health: Int, attackPower: Int, private var arrows: Int, private var evasion: Int): Character(name, health, maxHealth, attackPower){
	override fun attack(target: Character){
		if(arrows > 0){
			if(attackPower > target.health){
				target.health = 0;
				println("${target.name} got $attackPower damage\n ${target.name} HP: ${target.health}");
			}else{
				target.health -= attackPower;
				println("${target.name} got $attackPower damage\n ${target.name} HP: ${target.health}");
			}
		}
	}
	
	override fun defend(damage: Int){
		var actualAttack = maxOf(0, evasion-damage);
		if(actualAttack > this.health){
			this.health = 0;
			println("${this.name} got $actualAttack damage\n ${this.name} HP: ${this.health}");
		}else{
			this.health -= actualAttack;
			println("${this.name} got $actualAttack damage\n ${this.name} HP: ${this.health}");
		}
		
	}
	
	override fun specialAttack(target: Character){
		if(arrows >= 2){
			if(2*attackPower > target.health){
				target.health = 0;
				println("${target.name} got $attackPower damage\n ${target.name} HP: ${target.health}");
			}else{
				target.health -= 2*attackPower;
				println("${target.name} got $attackPower \n ${target.name} HP: ${target.health}");
			}
			this.arrows -= 2;
		}
	}
} 
