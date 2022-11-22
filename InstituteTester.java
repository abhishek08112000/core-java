package com.xworkz.setgetapp;

import com.xworkz.setgetapp.traininginstitute.TrainingInstituteDTO;

public class InstituteTester {

	public static void main(String[] args) {
		
		TrainingInstituteDTO.setInstituteId(112);
		System.out.println(TrainingInstituteDTO.getInstituteId());
		
		TrainingInstituteDTO.setInstituteName("X-Workz ODC");
		System.out.println(TrainingInstituteDTO.getInstituteName());
	}
}
