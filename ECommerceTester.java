package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.ecommerce.ECommerce;

public class ECommerceTester {

	public static void main(String[] args) {
		
		ECommerce eCommerce = new ECommerce();
		eCommerce.shopping("Leather Jacket");
		//eCommerce.shopping("Shoes");
		System.out.println("Thank You for ordering "+ eCommerce.purchase);
		
		ECommerce sister = new ECommerce();
		sister.shopping("Dress");
		
		eCommerce.presenting("Leather Jacket", sister);
		
		System.out.println("In my sister hand "+ sister.purchase);
		
		System.out.println("Mother ordering");
		ECommerce motherOrdering = new ECommerce();
		motherOrdering.shopping("Saree");
		motherOrdering.shopping("Bag");
		System.out.println("Thank you for ordering "+ motherOrdering.purchase);
		
		
	}
}
