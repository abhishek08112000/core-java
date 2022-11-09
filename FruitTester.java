package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.fruit.Apple;
import com.xworkz.inheritanceapp.fruit.Fruit;

public class FruitTester {

	public static void main(String[] args) {
		
		Fruit fruit = new Fruit();
		fruit.getProtien(2.3);
		System.out.println("Protien conten in orange is "+ fruit.protienContent);
		
		Apple apple = new Apple();
		apple.getProtien(1.03);
		System.out.println("Protien i apple is "+ fruit.protienContent);
		
		
	}
}
