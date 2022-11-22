package com.xworkz.setgetapp;

import com.xworkz.setgetapp.Library.LibraryDTO;

public class LibraryTester {

	public static void main(String[] args) {
		
		LibraryDTO.setLibraryNo(06);
		System.out.println(LibraryDTO.getLibraryNo());
		
		LibraryDTO.setName("Public Library");
		System.out.println(LibraryDTO.getName());
		
		LibraryDTO.setYearOfOpen(2001);
		System.out.println(LibraryDTO.getYearOfOpen());
	}
}
