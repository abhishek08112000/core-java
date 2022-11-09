package com.xworkz.inheritanceapp.festival;

public class FestivalTester {
public  static void main(String [] args) {
		
	        Festival cof =new Festival();
			cof.happy("sweets");
			System.out.println("food for festival is "+cof.good);
			
			Festival ref = new Festival();
		    ref.happy("Holige");
			System.out.println("Food for festival is "+ ref.good); 


	}


}
