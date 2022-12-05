package com.xworkz.taskapp;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str = "cat";
		String str1 = "tac";
		
		boolean isAnagram = false;
		
		if(str.length()==str1.length()) {
			
			char[] strAsChar = str.toCharArray();
			char[] str1AsChar = str1.toCharArray();
			
			Arrays.sort(strAsChar);
			Arrays.sort(str1AsChar);
			
			isAnagram = Arrays.equals(strAsChar, str1AsChar);
		}
		
		System.out.println(isAnagram);
		
	}
}
