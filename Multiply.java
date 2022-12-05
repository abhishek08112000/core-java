package com.xworkz.taskapp;

public class Multiply {

	public static void main(String[] args) {
		
		int num[] = {3,10,200,30};
		int p = 5;
		int result=0;
		for(int i=0;i<num.length;i++) {
			
			result = p*num[i];
			System.out.println(result);
			p=p*5;
			
		}
		
	
	}
	
}
