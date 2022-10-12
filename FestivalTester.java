class FestivalTester{


	public static void main(String a[]){
	
	
	Festival fest = new Festival();
	fest.nameOfFestival = "Dipavali" ;
	fest.occuringMonth = "November" ;
	fest.celebrationDays = 2 ;
	
	fest.habba();
	System.out.println("name Of Festival is "+ fest.nameOfFestival + "\n" + "Occurs during "+ fest.occuringMonth + " month" + "\n" + "it will celebrated till "+ fest.celebrationDays +  " days");
	
	
	Festival festi = new Festival();
	festi.nameOfFestival = "Dasara" ;
	festi.occuringMonth = "October" ;
	festi.celebrationDays = 2 ;
	
	festi.habba();
	System.out.println("name Of Festival is "+ festi.nameOfFestival + "\n" + "Occurs during "+ festi.occuringMonth + " month" + "\n" + "it will celebrated till "+ festi.celebrationDays +  " days");
	
	
	
	
	
	}



}