package com.xworkz.setgetapp.hotel;

public class HotelDTO {

	private static String gstNo;
	private static String hotelName;
	private static int noOfStaff;
	
	public static String getGstNo() {
		return gstNo;
	}
	
	public static void setGstNo(String gstNo) {
		HotelDTO.gstNo = gstNo;
	}
	
	public static String getHotelName() {
		return hotelName;
	}
	
	public static void setHotelName(String hotelName) {
		HotelDTO.hotelName = hotelName;
	}
	
	public static int getNoOfStaff() {
		return noOfStaff;
	}
	
	public static void setNoOfStaff(int noOfStaff) {
		HotelDTO.noOfStaff = noOfStaff;
	}
}
