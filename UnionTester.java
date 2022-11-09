package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.unioterritory.Delhi;
import com.xworkz.inheritanceapp.unioterritory.UnionTerritory;

public class UnionTester {

	public static void main(String[] args) {
		
		UnionTerritory territory = new UnionTerritory();
		territory.passing("AN");
		System.out.println(territory.vehiclePassing + " is the passing given to Andaman And Nicobar Islands vehicles");
		
		territory.passing("AP");
		System.out.println("Vehicle passing given to Arunachal Pradesh is "+ territory.vehiclePassing);
		
		Delhi delhi = new Delhi();
		delhi.passing("DL");
		System.out.println("The vehicle passing for delhi is "+ delhi.vehiclePassing);
		
	}
}
