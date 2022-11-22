package com.xworkz.setgetapp;

import com.xworkz.setgetapp.milkparlour.MilkParlourDTO;

public class ParlourTester {

	public static void main(String[] args) {
		
		MilkParlourDTO.setParlourId(1112);
		System.out.println(MilkParlourDTO.getParlourId());
		
		MilkParlourDTO.setParlourName("Namdini Milk Parlour");
		System.out.println(MilkParlourDTO.getParlourName());
	}
}
