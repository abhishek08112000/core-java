package com.xworkz.taskapp;

public class StringDigit {

	public static boolean chekForDigits(String s){
		
		if(s == null ||s.isEmpty()){
		return false;
		}
		
		for(int i=0 ; i<s.length() ; i++){
			if(!Character.isDigit(s.charAt(i))){
				return false;
			}
		}
		return true;
	}

		
	public static void main(String args[]){
		
		String digitString = "123";
		String textString = "Abhishek";
		
		boolean result = chekForDigits(digitString);
		System.out.println(result);
		
		result = chekForDigits(textString);
		System.out.println(result);
		
		
	}
}
