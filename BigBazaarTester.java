class BigBazaarTester{

	public static void main(String a[]){
	
	
		BigBazaar ref = new BigBazaar();
		ref.branch = "JP nagar" ;
		ref.noOfWorkers = 110 ;
		ref.gstNo = "ADDSFS1252511SD" ;
	
		ref.shopping();
		System.out.println(ref.branch + " " + ref.noOfWorkers + " " + ref.gstNo); 
		
		
		BigBazaar big = ref ;
		
		System.out.println(big.branch + " " + big.noOfWorkers + " " + big.gstNo); 
		
		
	
	}




}