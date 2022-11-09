package com.xworkz.inheritanceapp.flowers;



public class FlowerTester {

  public static void main(String[] args) {
	  
	  Flower flower = new Flower();
	  flower.toGetFlower("Sunflower");
	  System.out.println("It is" + flower.colour);
	  
	  Flower flor = new Flower();
	  flor.presenting("rose", flor);
	  System.out.println("This is " + flor.colour);
	
	  Rose rose = new Rose();
	  rose.toGetFlower("Lotus");
	  System.out.println("Is a " + rose.colour);
		
	
		
		
		}	
	}
