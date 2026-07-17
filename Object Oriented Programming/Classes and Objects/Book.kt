class Book(var title: String, var author: String, var price: Float){
	fun showBook(){
		println(" Title : ${this.title} \n Author: ${this.author} \n Price: ${this.price}");
	}
}
