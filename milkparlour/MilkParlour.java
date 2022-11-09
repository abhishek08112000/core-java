package com.xworkz.milkapp.milkparlour;

public class MilkParlour {

	public String name;
	public String location ;
	public String gstNo;
	public String workerNames[];
	public long contactNos[];
	public String milkShakes[];
	public String soda[];
	public String billingMethod[];
	
	
	
	
	
	
	
	public MilkParlour(String name, String location, String gstNo, String[] workerNames, long[] contactNos,
			String[] milkShakes, String[] soda, String[] billingMethod) {
		super();
		this.name = name;
		this.location = location;
		this.gstNo = gstNo;
		this.workerNames = workerNames;
		this.contactNos = contactNos;
		this.milkShakes = milkShakes;
		this.soda = soda;
		this.billingMethod = billingMethod;
	}







	public void getInfo() {
		
		
		System.out.println("Shop name is "+ name);
		System.out.println("**************");
		System.out.println("Location of the shop : "+ location);
		System.out.println("*******************");
		System.out.println("Gst NO :"+ gstNo);
		System.out.println("************");
		System.out.println("List of worker names : ");
		for(int i=0 ; i<workerNames.length ; i++) {
			System.out.println(workerNames[i]);
		}
		
		System.out.println("************");
		
		System.out.println("List of contact nos : ");
		for (int i = 0; i < contactNos.length; i++) {
			System.out.println(contactNos[i]);		
		}
		
		System.out.println("*************");
		
		System.out.println("List of milk shakes available : ");
		for(int i=0 ; i<milkShakes.length ; i++) {
			System.out.println(milkShakes[i]);
		}
		
		System.out.println("*****************");
		
		System.out.println("List of soda available : ");
		for(int i=0 ; i<soda.length ; i++) {
			System.out.println(soda[i]);
		}
		
		System.out.println("************");
		
		System.out.println("Billing methods : ");
		for(int i=0 ; i<billingMethod.length ; i++) {
			System.out.println(billingMethod[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
