open class Animal(var name: String, var age: Int){
	constructor() : this("none", 0)
	init{
		if(name.isBlank()){
			println("Name cannot be empty");
		}
	}
	
	init {
		if(age < 0){
			println("Invalid age!");
			this.age = 0;
		}
	}
	
	fun eat(){
		println("Animal eats");
	}
	
	fun sleep(){
		println("Animal sleeps");
	}
}

class Dog(var breed: String): Animal(){
	init{
		if(breed.isBlank()){
			println("Breed cannot be empty");
		}
	}
	fun bark(){
		println("Dog barks");
	}
}

fun main(){
	var dog = Dog("Japanese");
	dog.name = "Moti"
	dog.age = 10;
	
	println("Name = ${dog.name}")
	println("age = ${dog.age}")
	println("breed = ${dog.breed}")
}
