package com.xworkz.setgetapp;

import com.xworkz.setgetapp.hotel.HotelDTO;

public class HotelTester {

	public static void main(String[] args) {
		
		HotelDTO.setGstNo("ACVFG8512525GVC52");
		System.out.println(HotelDTO.getGstNo());
		
		HotelDTO.setHotelName("NagLingeshwara hotel");
		System.out.println(HotelDTO.getHotelName());
		
		HotelDTO.setNoOfStaff(12);
		System.out.println(HotelDTO.getNoOfStaff());
	}
}
