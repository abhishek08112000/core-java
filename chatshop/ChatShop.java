package com.xworkz.chatapp.chatshop;

public class ChatShop {

	public String name;
	public String address;
	public String gstNo ;
	public String staffNames[] ;
	public long staffContactNo[] ;
	public String menue[] ;
	public String billingMethod[] ;
	
//	public ChatShop() {
//		System.out.println("Chat shop constructor is invoked");
//	}
//	
	
	
	public ChatShop(String name, String address, String gstNo, String[] staffNames, long[] staffContactNo, String[] menue,
			String[] billingMethod) {
	
		this.name = name;
		this.address = address;
		this.gstNo = gstNo;
		this.staffNames = staffNames;
		this.staffContactNo = staffContactNo;
		this.menue = menue;
		this.billingMethod = billingMethod;
	}
	
	
	
	
	
	
	
	
	public void getInfo() {
		
		System.out.println("Name of the chat shop "+ name);
		System.out.println("*************");
		System.out.println("Location : "+ address);
		System.out.println("*************");
		System.out.println("Gst no : "+ gstNo);
		System.out.println("*************");
		System.out.println("List of workers");
		for (int i = 0; i < staffNames.length; i++) {
			System.out.println(staffNames[i]);
		}
		System.out.println("***********");
		System.out.println("contact no's are");
		for (int i = 0; i < staffContactNo.length; i++) {
			System.out.println(staffContactNo[i]);
		}
		System.out.println("********************");
		System.out.println("list of items");
		for (int i = 0; i < menue.length; i++) {
			System.out.println(menue[i]);
		}
		System.out.println("************");
		System.out.println("list of billing method");
		for (int i = 0; i < billingMethod.length; i++) {
			System.out.println(billingMethod[i]);
		}
		
		
		
		
	}


	
	
	
	
	
}
