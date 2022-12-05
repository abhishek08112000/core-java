package com.xworkz.taskapp;

public class WhoLikesIt {

	public static void main(String[] args) {
		String[] s = {"Abhi", "Prathap", "Manju", "Shashi", "Suraj"};
	      
	      int n = s.length;
	      
	      switch(n) {
	        case 0:
	          System.out.print("no ones likes this post");
	          break;
	        case 1:
	          System.out.println(s[n-1] + " likes this post");
	          break;
	        case 2:
	          System.out.println(s[n-2]+ " and " + s[n-1] + " likes this post");
	          break;
	        default:
	         System.out.println(s[n-2]+ ", " + s[n-1] + " and " + (s.length - 2 )+" others likes this post");
	      }
	}
}
