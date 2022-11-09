package com.xworkz.milkapp;

import com.xworkz.milkapp.milkparlour.MilkParlour;

public class MilkParlourTester {

	
	public static void main(String[] args) {
		
		
//		milk.name = "Nandini milk parlour";
//		milk.location = "MG Road";
//		milk.gstNo = "AVRD2569D6";
		
		String workerNames[] = new String[3];
		workerNames[0] = "Yogesh";
		workerNames[1] = "Madesh"; 
		workerNames[2] = "Swadeh";
		
		long contactNos[] = new long[3];
		contactNos[0] = 6598742659L ;
		contactNos[1] = 9568745621L;
		contactNos[2] = 8569471256L;
		
		String milkShakes[] = new String[5];
		milkShakes[0] = "Chocolate milk shake";
		milkShakes[1] = "Strawberry milk shake";
		milkShakes[2] = "Mango milk shake";
		milkShakes[3] = "Banana milk shake";
		milkShakes[4] = "Vannilla milk shake";
		
		String soda[] = new String[4];
		soda[0] = "Limbu soda";
		soda[1] = "Jeera soda";
		soda[2] = "Orange soda";
		soda[3] = "Goli soda";
		
		String billingMethod[] = new String[3];
		billingMethod[0] = "Cash";
		billingMethod[1] = "UPI";
		billingMethod[2] = "Credit/Debit card";
		
		MilkParlour milk = new MilkParlour("Nandini milk parlour", "MG Road","AVRD2569D6", workerNames, contactNos, milkShakes,
												soda, billingMethod);
		
		milk.getInfo();
		
		
		
		
		
	}
	
	
	
	
	
}
