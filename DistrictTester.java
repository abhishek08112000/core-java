class DistrictTester{


	public static void main(String a[]){
	
	
	Districts dis = new Districts();
	dis.districtName = "Bagalkot" ;
	dis.noOfTaluks = 6 ;
	dis.noOfVillages = 96 ;
	dis.famousFor = "Badami caves and temples of pattadkallu and Ihole" ;
	
	dis.letsGoOut() ;
	System.out.println("District name is "+ dis.districtName + "\n" + "No of taluks are "+ dis.noOfTaluks + "\n" + "no of Villages are "+ dis.noOfVillages + "\n" + "The district is famous for "+ dis.famousFor) ;
	
	Districts dis1 = new Districts();
	dis1.districtName = "Mandya" ;
	dis1.noOfTaluks =  7;
	dis1.noOfVillages = 1368 ;
	dis1.famousFor = "Ragi Mudde uta" ;
	
	dis1.letsGoOut() ;
	System.out.println("District name is "+ dis1.districtName + "\n" + "No of taluks are "+ dis1.noOfTaluks + "\n" + "no of Villages are "+ dis1.noOfVillages + "\n" + "The district is famous for "+ dis1.famousFor) ;
	
	
	Districts dis2 = new Districts();
	dis2.districtName = "Vijaypur" ;
	dis2.noOfTaluks = 5 ;
	dis2.noOfVillages = 199 ;
	dis2.famousFor = "GolGumbaz, IbrahimRoja and BaraKaman" ;
	
	dis2.letsGoOut() ;
	System.out.println("District name is "+ dis2.districtName + "\n" + "No of taluks are "+ dis2.noOfTaluks + "\n" + "no of Villages are "+ dis2.noOfVillages + "\n" + "The district is famous for "+ dis2.famousFor) ;
	
	
	
	
	}


}