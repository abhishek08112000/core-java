package com.xworkz.icecreameapp;

import com.xworkz.icecreameapp.icecreame.IceCreame;

public class IceCreameTester {

	public static void main(String[] args) {
		
		
		IceCreame ice = new IceCreame();
		ice.name = "Pandu ice creames";
		ice.location = "Vidyagiri Circle";
		ice.gstNo = "FE6GRR2366892VF6";
		
		ice.noOfWorkers = new String[3];
		ice.noOfWorkers[0] = "Pandu";
		ice.noOfWorkers[1] = "Parimala";
		ice.noOfWorkers[2] = "Veeresh";
		
		ice.iceCreames = new String[5];
		ice.iceCreames[0] = "Vannila ice creames";
		ice.iceCreames[1] = "Strawberry ice creame";
		ice.iceCreames[2] = "Chocolate ice creame";
		ice.iceCreames[3] = "Buuterscoutch ice creame";
		ice.iceCreames[4] = "Pistha ice creame";
		
		ice.coldDrinks = new String[5];
		ice.coldDrinks[0] = "Maza";
		ice.coldDrinks[1] = "Mountain dew";
		ice.coldDrinks[2] = "Fanata";
		ice.coldDrinks[3] = "7Up";
		ice.coldDrinks[4] = "Sprite";
		
		
		ice.billingMethod = new String[3] ;
		ice.billingMethod[0] = "Paytm";
		ice.billingMethod[1] = "Cash";
		ice.billingMethod[2] = "Phone pay";
		
		
		
		ice.getInfo();
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
