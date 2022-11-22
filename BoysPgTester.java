package com.xworkz.setgetapp;

import com.xworkz.setgetapp.boyspg.BoyPgDTO;

public class BoysPgTester {

	public static void main(String[] args) {
		
		BoyPgDTO.setDoorNo(771);
		System.out.println(BoyPgDTO.getDoorNo());
		
		BoyPgDTO.setPgName("Shri Vinayak PG");
		System.out.println(BoyPgDTO.getPgName());
	}
}
