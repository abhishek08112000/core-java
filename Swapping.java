package com.xworkz.taskapp;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
		System.out.println("Enter the value : ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=b-1;
		System.out.println("a = "+ a + " \n" + "b = "+ b); 
	}
}
