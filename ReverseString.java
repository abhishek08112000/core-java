package com.xworkz.taskapp;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		int l,i ;
		String z = "Abhishek";
		String x = "" ;
		l = z.length();
		
		for(i = l-1 ; i >=0 ; i--){
			x = x + z.charAt(i);
		}
		System.out.println(x);
		
		
		String str = "";
		System.out.println("Enter the word");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		char[] resultArray = input.toCharArray();
		
		for(int i1=resultArray.length-1 ; i1>=0; i1--) {
			System.out.print(resultArray[i1]);
			 str = str + resultArray[i1];
		}
		
		System.out.println();
		if(str.equals(input)) {
			System.out.println("The string is palindrome");
		}
		else {
			System.out.println("The string is not a palindrome");
		}
	}
}
