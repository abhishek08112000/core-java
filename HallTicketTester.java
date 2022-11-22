package com.xworkz.setgetapp;

import com.xworkz.setgetapp.hallticket.HallTicketDTO;

public class HallTicketTester {

	public static void main(String[] args) {
		
		HallTicketDTO.setStudentName("Anandkumar");
		System.out.println(HallTicketDTO.getStudentName());
		
		HallTicketDTO.setUsnNo("2GO19CV4002");
		System.out.println(HallTicketDTO.getUsnNo()); 
	}
}
