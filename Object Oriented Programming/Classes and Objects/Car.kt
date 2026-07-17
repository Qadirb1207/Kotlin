class Car(var brand: String, var model: String, var color: String){
	fun showDetails(){
		println("Brand: ${this.brand}");
		println("Model: ${this.model}");
		println("Color: ${this.color}");
	}
}
