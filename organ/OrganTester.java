package com.xworkz.inheritanceapp.organ;

public class OrganTester {

	public static void main(String[] args) {
		
		Organ organ = new Organ();
		organ.runsEverytime("Mentain human body");
		System.out.println("The organ is used for "+ organ.function);
		
		Heart dil = new Heart();
		dil.runsEverytime("Circulates blood");
		System.out.println("The major fuction of heart is "+ dil.function);
		
		dil.runsEverytime("Oxidating and Di-Oxidating");
		System.out.println("Another function of heart is "+ dil.function);
	}
}
