package com.xworkz.inheritanceapp.searchengine;

public class SearchTester {

	public static void main(String[] args) {
		
		SearchEngine searching = new SearchEngine();
		searching.searchingFor("What is Inheritance..");
		System.out.println("Are you searching for "+ searching.search + " ?");
		
		SearchEngine ref = new SearchEngine();
		ref.searchFor("Use of Inhertance..");
		System.out.println("Showing result on "+ ref.search);
		
		Google google = new Google();
		google.searchingFor("vtu.ac.in");
		System.out.println("Results on "+ google.search);
		
		
		
	}
}
