package com.xworkz.taskapp;

public class TaskOnWednesday {

	public static void main(String[] args) {
		
		char letter = 'A';
		
		for(int i=0; i<4;i++) {
			
			for(int j=0 ; j<=i; j++) {
				
				System.out.print((char)(letter+i)+" ");
			}
			System.out.println(); 
		}
	}
}
