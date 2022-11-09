package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.hospital.Hospital;

public class HospitalTester {
	
	public static void main(String[] args) {
		
		Hospital hospital = new Hospital() ;
		System.out.println("hospital object invoked");
		hospital.savePatientNames("Ganesha") ;
		hospital.savePatientNames("Gouri") ;
		hospital.savePatientNames("Shivu") ;
		hospital.savePatientNames("Nandisha") ;
		hospital.savePatientNames("Saraswati") ;
		hospital.savePatientNames("Bhramha") ;
		hospital.savePatientNames("Vishnu") ;
		hospital.getPatientNames();
		
		hospital.updatePatientName("Gouri" , "Gouri Shankar"); 
		
		hospital.getPatientNames(); 
	}

}
