object Q3{
	def main(args:Array[String]){
	var total:Double=price(60)-discount(price(60))+SCost(60);
	println("Total Cost "+total);


}
	

	def price(Q:Double):Double={
		Q*24.95;
		

}
	def discount(D:Double):Double={
		D*0.4;

}
	def SCost(S:Double):Double={
		3*50+(S-50)*075;
}

}
