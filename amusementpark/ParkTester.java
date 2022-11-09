package com.xworkz.inheritanceapp.amusementpark;

public class ParkTester {

	public static void main(String[] args) {
		
		AmusementPark park = new AmusementPark();
		park.enjoyment(150);
		System.out.println("The entry ticket is "+ park.price);
		
		Wonderlaa wonder = new Wonderlaa();
		wonder.enjoyment(800);
		System.out.println("The entry ticket price is "+ wonder.price);
		
	}
}
