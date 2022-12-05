package com.xworkz.taskapp;

import java.util.Arrays;

public class Arrayy {

	public static void main(String[] args) {
		int arr[]={2,6,4,5,8};
	    int n=arr.length;
	   
	    // sorting the array using
	    // in-built sort function
	    Arrays.sort(arr);
	   
	    // printing the desired element
	    System.out.println("smallest element is "+arr[0]);
	    System.out.println("second smallest element is "+arr[1]);
	    System.out.println("product of above two numbers " +arr[0]*arr[1]);
	}
}
