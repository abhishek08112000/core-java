package com.xworkz.taskapp;

import java.util.Scanner;

public class WhiteSpace {

	public static void main(String[] args) {
		String str = "S U P E R";
		
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
		
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		char[] c = a.toCharArray();
		for(int i=0 ; i<c.length ; i++) {
			if(c[i] !=' ') {
				System.out.print(c[i]);
			}
		}
		
	}
}
