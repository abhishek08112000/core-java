package com.xworkz.setgetapp.boyspg;

public class BoyPgDTO {

	private static int doorNo;
	private static String pgName;
	
	public static int getDoorNo() {
		return doorNo;
	}
	
	public static void setDoorNo(int doorNo) {
		BoyPgDTO.doorNo = doorNo;
	}
	
	public static String getPgName() {
		return pgName;
	}
	
	public static void setPgName(String pgName) {
		BoyPgDTO.pgName = pgName;
	}
}
