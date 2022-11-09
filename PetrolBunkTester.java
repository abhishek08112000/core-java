package com.xworkz.overloadingapp;

import com.xworkz.overloadingapp.conceptoverloading.PetrolBunk;

public class PetrolBunkTester {

	public static void main(String[] args) {
	
		
//	PetrolBunk bunk = new PetrolBunk(152,"DeveGouda petrol bunk", "Mahalaxmi layout",
//						workerName);
//		
//		System.out.println("Petrol bunk id : "+ bunk.id + "\n" + "Petrol bunk name : "+ bunk.name
//							+ "\n"+ "Location : " + bunk.location);
//		
//		System.out.println("List of workers");
//		for(int i=0 ; i<workerName.length;i++) {
//			System.out.println(workerName[i]);
//		}
		
		String workerName[] = {"Akash","Sumanth","Sneha","Manjula","Sagar","Navya","Divya"};
		PetrolBunk bunk2 = new PetrolBunk(workerName);
		
		bunk2.displayDetails();
		
		
		
		
	}

	
	
}
