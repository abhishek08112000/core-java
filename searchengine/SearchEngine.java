package com.xworkz.inheritanceapp.searchengine;

public class SearchEngine {

	String name;
	public String search;
	
	public void searchingFor(String search) {
		
		this.search = search;
		System.out.println("Search here.....");
		
	}
	
	public void searchFor(String search) {
		
		this.search = search;
		
	}
	
	
}
