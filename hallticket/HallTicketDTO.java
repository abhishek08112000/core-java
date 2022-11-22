package com.xworkz.setgetapp.hallticket;

public class HallTicketDTO {

	private static String usnNo;
	private static String studentName;
	private static String university;
	
	public static String getStudentName() {
		return studentName;
	}
	public static void setStudentName(String studentName) {
		HallTicketDTO.studentName = studentName;
	}
	
	public static String getUsnNo() {
		return usnNo;
	}
	public static void setUsnNo(String usnNo) {
		HallTicketDTO.usnNo = usnNo;
	}
}
