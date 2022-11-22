package com.xworkz.setgetapp;

import com.xworkz.setgetapp.hospital.HospitalDTO;

public class HospitalTester {

	public static void main(String[] args) {
		
		HospitalDTO.setHospitalName("Kerudi");
		System.out.println(HospitalDTO.getHospitalName());
		
		HospitalDTO.setNoOfDoctors(12);
		System.out.println(HospitalDTO.getNoOfDoctors());
		
		HospitalDTO.setNoOfWards(200);
		System.out.println(HospitalDTO.getNoOfWards());
	}
}
