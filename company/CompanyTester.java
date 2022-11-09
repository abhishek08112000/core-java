package com.xworkz.inheritanceapp.company;

public class CompanyTester {
	
	public static void main(String[] args) {
		
		Company company = new Company();
		company.toGetJob("Kavya");
		System.out.println("The employe name is " + company.employe);
		
		Tcs cs = new Tcs();
		cs.toGetJob("Abhishek");
		System.out.println("Second employe name is " + cs.employe);
	}

}
