class ConventionHallTester{

	public static void main(String a[]){
	
	
	ConventionHall con = new ConventionHall();
	con.name = "Sitaram Kalyana mantapa" ;
	con.owner = "Prashatayya Yettinmath" ;
	con.mostUsedFor = "Marriage function" ;
	con.rentForOneDay = 25000 ;
	
	con.hall();
	System.out.println(con.name + "\n"+ con.owner + "\n" + con.mostUsedFor + "\n" + con.rentForOneDay);
	
	
	ConventionHall conv = new ConventionHall();
	conv.name = "Gouri Shakara Kalyana mantapa" ;
	conv.owner = "Viranna Charantimath" ;
	conv.mostUsedFor = "Marriage function" ;
	conv.rentForOneDay = 30000 ;
	
	con.hall();
	System.out.println(conv.name + "\n"+ conv.owner + "\n" + conv.mostUsedFor + "\n" + conv.rentForOneDay);
	
	
	
	
	
	
	}


}