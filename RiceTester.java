class RiceTester{


	public static void main(String a[]){
	
	
	Rice ref = new Rice() ;
	ref.brandName = "KV Gold" ;
	ref.typeOfRice = "Mogra Rice" ;
	ref.price = 1200 ;
	
	ref.getRice() ;
	System.out.println("Rice brand is "+ ref.brandName + "\n" + "Type of rice is "+ ref.typeOfRice + "\n" + "Price of one bag is "+ ref.price);
	
	
	Rice ref1 = new Rice();
	ref1.brandName = "India Gate" ;
	ref1.typeOfRice = "Basmati rice" ;
	ref1.price = 120 ;
	
	ref1.getRice();
	System.out.println("Rice brand is "+ ref1.brandName + "\n" + "Type of rice is "+ ref1.typeOfRice + "\n" + "Price of one bag is "+ ref1.price);
	
	
	
	
	
	}



}