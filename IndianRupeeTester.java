class IndianRupeeTester{

	public static void main(String args[]){
	
		
		IndianRupee ind = new IndianRupee();
		ind.serialNo = "A45825C5";
		ind.color = "Magenta" ;
		ind.name = "2000 Rupees" ;
		
		ind.maja();
		System.out.println(ind.serialNo + " " + ind.color + " " + ind.name);
	
		
		IndianRupee ind1 = new IndianRupee();
		ind1.serialNo = "A428D5564";
		ind1.color = "Olive green" ;
		ind1.name = "20 Rupees" ;
		
		ind1.maja();
		System.out.println(ind1.serialNo + " " + ind1.color + " " + ind1.name);
		
		IndianRupee ind2 = new IndianRupee();
		ind2.serialNo = "152B15514";
		ind2.color = "Bright Yellow" ;
		ind2.name = "200 Rupees" ;
		
		ind2.maja();
		System.out.println(ind2.serialNo + " " + ind2.color + " " + ind2.name);
		
	
	}


}