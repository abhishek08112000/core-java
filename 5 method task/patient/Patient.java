package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constant.Gender;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Patient {

	private String patientName;
	private String address;
	private Gender gender;
	private int age;
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	
	public Patient(String patientName, String address, Gender gender, int age) {
		
		this.patientName = patientName;
		this.address = address;
		this.gender = gender;
		this.age = age;
	}



	public void diplayPatientDetails() {
		
		System.out.println("Patient name is : "+ this.patientName);
		System.out.println("Address : "+ this.address);
		System.out.println("Patient gender : "+ this.gender);
		System.out.println("Patient age : "+ this.age);
		
	}
	
	
}
