package com.xworkz.setgetapp.milkparlour;

public class MilkParlourDTO {

	private static int parlourId;
	private static String parlourName;
	
	public static int getParlourId() {
		return parlourId;
	}
	public static void setParlourId(int parlourId) {
		MilkParlourDTO.parlourId = parlourId;
	}
	
	public static String getParlourName() {
		return parlourName;
	}
	public static void setParlourName(String parlourName) {
		MilkParlourDTO.parlourName = parlourName;
	}
}
