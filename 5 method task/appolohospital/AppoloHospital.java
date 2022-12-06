package com.xworkz.hospitalapp.appolohospital;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class AppoloHospital extends Hospital{

	
	public Patient[] patients;
	int index;
	
	public AppoloHospital(int size) {
		patients = new Patient[size];
	}
	
	public boolean addPatient(Patient patient) {
		System.out.println("Inside add patient method");
		boolean isPatientAdded = false;
		if(patient != null) {
			System.out.println("Patient details are right....go ahead");
			patients[index] = patient;
			isPatientAdded = true;
			index++ ;
			
		}
		return isPatientAdded;
	}
	
	public void getAllPatients() {
		System.out.println("The list of patients");
		for (int i = 0; i < patients.length; i++) {
			System.out.println(patients[i].getPatientName() + "  " + patients[i].getAge() + "  " + patients[i].getGender() + "  " + patients[i].getAddress());
			
		}
	}
	
	public void getPatientByName(String patientName) {
		System.out.println("Inside getPatientByName");
		System.out.println("No of parameter : 1 : patientName");
		
		for (int i = 0; i < patients.length; i++) {
			
			if(patients[i].getPatientName().equals(patientName)) {
				System.out.println(patients[i].getPatientName() + "  " +patients[i].getAge() + "  " + patients[i].getGender() 
						+ "  " + patients[i].getAddress());
			}
			
		}
	}
	
	public void getPatientByAge(int age) {
		System.out.println("Inside getPatientBy age");
		
		for (int j = 0; j < patients.length; j++) {
			
			if(patients[j].getAge() == age) {
				System.out.println(patients[j].getPatientName() + "  " +patients[j].getAge() + "  " + patients[j].getGender() 
						+ "  " + patients[j].getAddress());
			}
			
		}
	}
	
	public void getPatientByGender(Gender gender) {
		System.out.println("Inside get patient by gender");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getGender().equals(gender)) {
				System.out.println(patients[i].getPatientName() + "  " +patients[i].getAge() + "  " + patients[i].getGender() 
						+ "  " + patients[i].getAddress());
			}
		}
	}
	
	
	public boolean getPatientByAddress(String address) {
		System.out.println("Inside get patient by address");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getAddress().equals(address)) {
				System.out.println(patients[i].getPatientName() + "  " +patients[i].getAge() + "  " + patients[i].getGender() 
						+ "  " + patients[i].getAddress());
			}
		}
		return true;
	}
	
	public void getPatientNameByGender(Gender gender) {
		System.out.println("Inside get patient by gender");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getGender().equals(gender)) {
				System.out.println(patients[i].getPatientName());
			}
			else {
				System.out.println("No patient found");
			}
		}
	}
	
	
	public void getGenderByPatientName(String patientName) {
		System.out.println("Inside getPatientByName");
		for (int i = 0; i < patients.length; i++) {
			
			if(patients[i].getPatientName().equals(patientName)) {
				System.out.println(patients[i].getGender());
			}
			
		}
	}
	
	
}
