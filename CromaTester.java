class CromaTester{

	public static void main(String a[]){
	
	
	Croma shop = new Croma();
	shop.location = "Rajajinagar" ;
	shop.noOfFloors = 4 ;
	shop.noOfWorkers = 15 ;
	shop.whatWeGet = "Electronics" ;
	
	shop.gadgets();
	System.out.println("Location of the shop is "+ shop.location + "\n" + "No of floors are "+ shop.noOfFloors + "\n" + "No of workers are "+ shop.noOfWorkers + "\n" + "We will get some "+ shop.whatWeGet + "over there");
	
	
	Croma shopi = new Croma();
	shopi.location = "Rajajinagar" ;
	shopi.noOfFloors = 4 ;
	shopi.noOfWorkers = 15 ;
	shopi.whatWeGet = "Electronics" ;
	
	shopi.gadgets();
	System.out.println("Location of the shop is "+ shopi.location + "\n" + "No of floors are "+ shopi.noOfFloors + "\n" + "No of workers are "+ shopi.noOfWorkers + "\n" + "We will get some "+ shopi.whatWeGet + "over there");
	
	
	
	}



}