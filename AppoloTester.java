package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.appolohospital.AppoloHospital;
import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.patient.Patient;

public class AppoloTester {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scanner.nextInt(); 
		
		AppoloHospital appolo = new AppoloHospital(size);
		
		for (int i = 0; i < size; i++) {
			
			Patient patient = new Patient();
			
			System.out.println("Enter patient name");
			patient.setPatientName(scanner.next()) ;
			
			System.out.println("Enter patient age");
			patient.setAge(scanner.nextInt());
			
			System.out.println("Enter gender");
			
			 patient.setGender(Gender.valueOf(scanner.next()));
			
			System.out.println("Enter patient address");
			patient.setAddress(scanner.next());
			
			
			appolo.addPatient(patient); 
			
		}
		
		
		
		appolo.getAllPatients();
		
		System.out.println("Enter the patient name : ");
		appolo.getPatientByName(scanner.next());
		
		System.out.println("Enter the patient age");
		appolo.getPatientByAge(scanner.nextInt()); 
		
		System.out.println("Enter the gender");
		appolo.getPatientByGender(Gender.valueOf(scanner.next()));
		
		System.out.println("Enter the address of patient");
		appolo.getPatientByAddress(scanner.next());
		
		System.out.println("Enter the gender of your patient");
		appolo.getPatientNameByGender(Gender.valueOf(scanner.next()));
		
		System.out.println("Enter name of your patient");
		appolo.getGenderByPatientName(scanner.next());
		
		
		scanner.close();
	}
}
