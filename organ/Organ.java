package com.xworkz.inheritanceapp.organ;

public class Organ {

	String name;
	public String function; 
	
	public void runsEverytime(String function) {
		
		this.function = function;
		System.out.println("This organ is very imp..");
	}
}
