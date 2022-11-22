package com.xworkz.setgetapp.traininginstitute;

public class TrainingInstituteDTO {

	private static int instituteId;
	private static String instituteName;
	
	public static int getInstituteId() {
		return instituteId;
	}
	
	public static void setInstituteId(int instituteId) {
		TrainingInstituteDTO.instituteId = instituteId;
	}
	
	public static String getInstituteName() {
		return instituteName;
	}
	
	public static void setInstituteName(String instituteName) {
		TrainingInstituteDTO.instituteName = instituteName;
	}
}
