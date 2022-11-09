package com.xworkz.hospitalapp.hospital;

public class Hospital {

	// String patientName[] = {null,null,null,null}; 
	// previously used array method
	
	// Datatype variable[] = new Datatype[size] ;
	String patientNames[] = new String[6] ;
	int index ;
	
	
	public boolean savePatientNames(String patientName) {
		System.out.println("inside savePatientNames");
		
		if(patientName != null && patientNames.length > index) {
			patientNames[index++] = patientName;
			return true ;
		}
		else{
			System.out.println("Bed kaali ella..........");
		}
		
		System.out.println("end of savePatientNames") ;
		return false ;
	}
	
	public void getPatientNames() {
		for(int i = 0 ; i<patientNames.length ; i++) {
			System.out.println(patientNames[i]); 
		}
	}
	
	public boolean updatePatientName(String oldPatientName , String newPatientName) {
		System.out.println("Update method started") ;
		for(int i = 0 ; i<patientNames.length ; i++) {
			if(patientNames[i] == oldPatientName ) {
			
				patientNames[i] = newPatientName ; 
				
				
				return true ; 
			}
		}
		return false ;
	}
	
}
