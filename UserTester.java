package com.xworkz.setgetapp;

import com.xworkz.setgetapp.user.UserDTO;

public class UserTester {

	public static void main(String[] args) {
		
		UserDTO.setUserId(546958475L);
		UserDTO.setUserName("Shashikumar");
		
		System.out.println(UserDTO.getUserId() + "\n" + UserDTO.getUserName());
	}
}
