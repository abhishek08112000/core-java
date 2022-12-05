package com.xworkz.taskapp;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		System.out.println("Enter the digit");
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		
		int temp = z;
		int x, sum =0;
		
		while(z>0) {
			x = z % 10;
			z = z/10;
			sum = sum + x*x*x ;
		}
		
		if(temp == sum) {
			System.out.println("The given number is armstrong");
		}
		else {
			System.out.println("It is not  a armstrong number");
		}
		
	}
}
