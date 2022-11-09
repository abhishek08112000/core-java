package com.xworkz.inheritanceapp.historicplace;

public class HistoricTester {

	public static void main(String[] args) {
		
		HistoricPlace place = new HistoricPlace();
		place.mostVisitingPlace("GolGumbaz");
		System.out.println("The "+ place.cityName + " is most visiting place in Vijaypur");
		
		Badami badami = new Badami();
		badami.mostVisitingPlace("Badami Caves");
		System.out.println("The most visited place in Bagalkot is  "+ badami.cityName);
		
	}
}
