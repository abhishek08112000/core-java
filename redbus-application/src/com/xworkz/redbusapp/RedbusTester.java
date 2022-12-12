package com.xworkz.redbusapp;

import com.xworkz.redbusapp.contract.RedBusContract;
import com.xworkz.redbusapp.transport.Transportation;
import com.xworkz.redbusapp.vrl.VrlImpl;

public class RedbusTester {

	
	public static void main(String[] args) {
		
		
		RedBusContract redbus = new VrlImpl();
		
		Transportation transport = new Transportation();
		transport.noOfBookings = 20 ;
		transport.bookings(redbus);
		
	}
}
