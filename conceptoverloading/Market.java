package com.xworkz.overloadingapp.conceptoverloading;

public class Market {

	public String name;
	public String location;
	public String vegetables[] = new String[5];
	
	// default constructor
	public Market() {
		System.out.println("Market objeck is invoked");
	}
	
	
	public Market(String name, String location, String vegetables[]) {
		this.name = name;
		this.location = location;
		this.vegetables = vegetables;
	}
	
	public Market(String vegetables[]) {
		this("City Market","Bsgslkot",vegetables);
		
	}
	
	public void displayDetails() {
		System.out.println("Display details is invoked");
		System.out.println( this.name + "\n" + this.location);
		System.out.println("List of vegetables");
		for (int i = 0; i < vegetables.length; i++) {
			System.out.println(vegetables[i]); 
		}
		
	}
	
	
}