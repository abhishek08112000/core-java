package com.xworkz.icecreameapp.icecreame;

public class IceCreame {

	public String name;
	public String location;
	public String gstNo;
	public String noOfWorkers[];
	public String iceCreames[] ;
	public String coldDrinks[];
	public String billingMethod[];
	
	
	public IceCreame() {
		System.out.println("Ice Creame object is invoked");
	}
	
	
	public void getInfo() {
		System.out.println("Name : "+ name);
		System.out.println("***************");
		System.out.println("Location : "+ location);
		System.out.println("*****************");
		System.out.println("Gst No : "+ gstNo);
		System.out.println("*****************");
		
		System.out.println("List of workers");
		for(int i=0 ; i<noOfWorkers.length ; i++) {
			System.out.println(noOfWorkers[i]);
		}
		
		System.out.println("****************");
		System.out.println("List of Ice Creames");
		for(int i=0 ; i<iceCreames.length ; i++) {
			System.out.println(iceCreames[i]);
		}
		
		System.out.println("*****************");
		System.out.println("List of cold drinks");
		for(int i=0 ; i<coldDrinks.length ; i++) {
			System.out.println(coldDrinks[i]);
		}
		
		System.out.println("*****************");
		System.out.println("List of billing method");
		for(int i=0 ; i<billingMethod.length ; i++) {
			System.out.println(billingMethod[i]);
		}
		
		
	}
	
	
	
	
}
