package com.xworkz.overloadingapp;

import com.xworkz.overloadingapp.conceptoverloading.Market;

public class MarketTester {

	public static void main(String[] args) {
		
//		Market ref = new Market("City Market","Bagalkot" , vegetables);
//		
//		System.out.println(ref.name + " " + ref.location);
//		
//		System.out.println("List of vegetables");
//		for(int i=0 ; i<vegetables.length ; i++) {
//			System.out.println(vegetables[i]);
//		}
		
		String vegetables[] = {"Onion","Carrot","Tomoto","Chilli","Beetroot"};
		Market ref2 = new Market(vegetables);
		
		ref2.displayDetails();
		
		
	}
}
