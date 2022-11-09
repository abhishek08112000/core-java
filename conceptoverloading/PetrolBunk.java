package com.xworkz.overloadingapp.conceptoverloading;

public class PetrolBunk {

	public int id;
	public String name;
	public String location;
	public String workerName[] = new String[7];
	
	
	// default constructor
	public PetrolBunk() {
		System.out.println("Petrol Bunk object is invoked");
	}
	
	public PetrolBunk(String[] workerName) {
		
		this(163,"DeveGouda petrol bunk", "Mahalaxmi layout", workerName);
		System.out.println("Calling one parameterize constructor");
		
	}

	// Parameterized constructor
	public PetrolBunk(int id, String name, String location, String[] workerName) {
		
		this();
		System.out.println("Calling 4 parameterized constructor");
		this.id = id;
		this.name = name;
		this.location = location;
		this.workerName = workerName; 
	}
	
	
	public void provideFuels() {
		
	}

	public void displayDetails() {
		System.out.println("Display details is invoked");
		System.out.println(this.id + "\n" + this.name + "\n" + this.location);
		System.out.println("List of workers for "+ this.name);
		for (int i = 0; i < workerName.length; i++) {
			System.out.println(workerName[i]);
		}
		
	}
	
	
	
	
	
}







