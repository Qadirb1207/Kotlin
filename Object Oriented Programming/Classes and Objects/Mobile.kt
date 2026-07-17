class Mobile(var company: String, var model: String, var ram: Int, var storage: Int){
	fun showMobile(){
		println(" Company: ${this.company} \n Model: ${this.model} \n RAM : ${this.ram} \n Storage: ${this.storage}");
	}
}
