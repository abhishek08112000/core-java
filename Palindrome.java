package com.xworkz.taskapp;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		int rem = 0;
		int sum = 0;
		int temp = num;
		
		while(num>0) {
			rem = num%10;
			sum = (sum*10) + rem;
			num = num/10;
		}
		
		if(temp==sum) {
			System.out.println("It is a palindrome number");
		}
		else {
			System.out.println("It is not a palindrome number");
		}
	}
}
