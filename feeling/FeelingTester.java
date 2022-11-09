package com.xworkz.inheritanceapp.feeling;


public class FeelingTester {
public  static void main(String [] args) {
		
	Feeling cof =new Feeling();
		cof.happy("crazy");
		System.out.println("get "+cof.good);
		
		Feeling ref = new Feeling();
	    ref.happy("petrol");
		System.out.println("bike want "+ ref.good + "for ride");


}

}
