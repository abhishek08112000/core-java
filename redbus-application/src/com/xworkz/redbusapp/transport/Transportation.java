package com.xworkz.redbusapp.transport;

import com.xworkz.redbusapp.contract.RedBusContract;

public class Transportation {

	
	RedBusContract redbusContract  ; 
	
	public int noOfBookings;
    String name = "Sri Durga parameshawari";

   public boolean bookings(RedBusContract contract) {
	   boolean isBookingDone = false ; 
	 System.out.println("Inside bookings method");
	 boolean condition = contract.conditionbOfBus();
	 if(condition == true) {
		 System.out.println("Bus is in good condition");
		 if(noOfBookings <= contract.minBookings()) {
			 System.out.println("No of bookings is " + noOfBookings);
			 System.out.println("Thank you for Boking the ticket through "+ name);
			 isBookingDone = true;
			 
		 }
		 else {
			 System.out.println("Can not proceed with Bookings as noOfBookings Exceeds");
		 }
	 }
	 else {
		 System.out.println("Can not proceed with Bookings as Bus is not in good condition");
	 }
	 return isBookingDone;
   }
	
}
