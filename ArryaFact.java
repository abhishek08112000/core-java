package com.xworkz.taskapp;

public class ArryaFact {

	public static void main(String[] args) {
		
		int sum=0;
		int a[] = {2,4,6,16};
		int f=1;
		int size = a.length-1;
		for(int i=0 ; i<=size ; i++) {
			if(a[i] <10) {
				for(int j=a[i];j>0;j--) {
					f=f*j;
				}
				System.out.println(f);
				f=1; 
			}
		}
			
		for(int k=1 ; k<=size ; k++) {
			if(a[k]>15) {
				while(a[k] !=0) {
					int rem=a[k] %10;
					sum=sum+rem;
					a[k] = a[k]/10;
				}
			}
			
		}
		System.out.println(sum);
		
		
		
		
		
		
	}
}
