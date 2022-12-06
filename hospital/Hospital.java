package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;
 
public class Hospital {

	public Patient patient;
	public boolean isEmergency;
	public boolean isTreatmentRequired;
	
	public boolean admit(Patient patient) {
		boolean isAdmitted = false;
		System.out.println("Inside admit method");
		if(isTreatmentRequired == true) {
			if(isEmergency == true) {
			this.patient = patient;
			this.patient.diplayPatientDetails();
			System.out.println("The patient is allowed in the ICU room");
			isAdmitted = true;
			}
			else {
			System.out.println("Admit the patient in general ward");
			}
			isAdmitted = true;
		}
		else {
			System.out.println("Treatment is  not required");
		}
		return isAdmitted;
		
		
	}
	
}
