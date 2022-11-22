package com.xworkz.setgetapp.Library;

public class LibraryDTO {

	private static int libraryNo;
	private static String name;
	private static int yearOfOpen;
	
	public static int getLibraryNo() {
		return libraryNo;
	}
	
	public static void setLibraryNo(int libraryNo) {
		LibraryDTO.libraryNo = libraryNo;
	}
	
	public static String getName() {
		return name;
	}
	
	public static void setName(String name) {
		LibraryDTO.name = name;
	}
	
	public static int getYearOfOpen() {
		return yearOfOpen;
	}
	
	public static void setYearOfOpen(int yearOfOpen) {
		LibraryDTO.yearOfOpen = yearOfOpen;
	}
}
