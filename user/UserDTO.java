package com.xworkz.setgetapp.user;

public class UserDTO {

	private static long userId;
	private static String userName;
	
	public static long getUserId() {
		return userId;
	}
	
	public static void setUserId(long userId) {
		UserDTO.userId = userId;
	}
	
	public static String getUserName() {
		return userName;
	}
	
	public static void setUserName(String userName) {
		UserDTO.userName = userName;
	}
}
