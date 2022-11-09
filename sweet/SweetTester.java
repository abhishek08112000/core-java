package com.xworkz.inheritanceapp.sweet;

public class SweetTester {
	
	public static void main(String[] args) {
	
		Sweet sweet = new Sweet();
		sweet.madeUpOf("Boondi");
		System.out.println(sweet.ingredients);
		
		Sugar sugar = new Sugar();
		sugar.madeUpOf("kaju");
		System.out.println(sugar.ingredients);
	}

}
