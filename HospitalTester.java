package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the patient name");
		String patientName = sc.next();
		System.out.println("Enter the address name");
		String address = sc.next();
		System.out.println("Enter the patient's age");
		int age = sc.nextInt();
		
		
		Patient patient = new Patient();
		Hospital hospital = new Hospital();
		hospital.isTreatmentRequired = true;
		hospital.isEmergency = true;
		boolean isAdmitted = hospital.admit(patient);
		System.out.println("Patient admitted is : "+ isAdmitted);
		
		//Scanner sca = new Scanner(System.in);
		System.out.println("Enter the patient name");
		String patientName1 = sc.next();
		System.out.println("Enter patient address");
		String address1 = sc.next();
		
		Patient patient2 = new Patient(patientName1, address1, Gender.Female, 62);
		Hospital hospital2 = new Hospital();
		hospital2.isTreatmentRequired = true;
		hospital2.isEmergency = false;
		boolean isAdmitted1 = hospital2.admit(patient2);
		System.out.println("Patient admitted is : "+ isAdmitted1);
		
		sc.close();
		//sca.close();
		
		
	}
}
