package com.xworkz.taskapp;

public class PatternPro {

	public static void main(String[] args) {
		
		for(int row=1; row<=5 ; row++) {
			for(int col=1 ;col<=5; col++) {
				
				if(row==3 && col==5) {
					System.out.print("Xworkz ");
				}
				else {
					System.out.print(col);
				}
				
			}
			System.out.println();
		}
	}
}
