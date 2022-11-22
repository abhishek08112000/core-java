package com.xworkz.setgetapp.hospital;

public class HospitalDTO {

	private static String hospitalName;
	private static int noOfDoctors;
	private static int noOfWards;
	
	public static String getHospitalName() {
		return hospitalName;
	}
	
	public static void setHospitalName(String hospitalName) {
		HospitalDTO.hospitalName = hospitalName;
	}
	
	public static int getNoOfDoctors() {
		return noOfDoctors;
	}
	
	public static void setNoOfDoctors(int noOfDoctors) {
		HospitalDTO.noOfDoctors = noOfDoctors;
	}
	
	public static int getNoOfWards() {
		return noOfWards;
	}
	
	public static void setNoOfWards(int noOfWards) {
		HospitalDTO.noOfWards = noOfWards;
	}
}
