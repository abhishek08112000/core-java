class SoapTester{

	public static void main(String args[]){
	
	// creat multiple 
	
	// object creation 
	// ClassName refe = new ClassName()
	
	Soap soap = new Soap() ;
	
	soap.brandName = "Dettol";
	soap.shape = "Rectangle";
	soap.price = 15 ;
	
	soap.toGetFresh();
	System.out.println(soap.brandName+ " " + soap.shape+ " " + soap.price);
	
	Soap soap1 = new Soap() ;
	
	soap1.brandName = "fiam";
	soap1.shape = "Oval";
	soap1.price = 10 ;
	
	soap1.toGetFresh();
	System.out.println(soap1.brandName+ " " + soap1.shape+ " " + soap1.price);
	
	
	
	
	
	
	}

}