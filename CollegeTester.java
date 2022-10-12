class CollegeTester{

	public static void main(String a[]){
	
	College edu = new College() ;
	edu.name = "BGMIT Mudhol" ;
	edu.noOfDepartments = 4 ;
	edu.nameOfPrinciple = "Prof.Shravankumar B Kerur" ;
	edu.noOfStudents = 350 ;
	
	edu.toGetKnowledge();
	System.out.println("Name of the college is "+ edu.name + "\n" + "No of departments are "+ edu.noOfDepartments + "\n" +"Name of the principle is "+ edu.nameOfPrinciple + "\n" +"No of students in college are "+ edu.noOfStudents) ;
	
	
	College educ = new College() ;
	educ.name = "Basaveshwara Engineering College" ;
	educ.noOfDepartments = 12 ;
	educ.nameOfPrinciple = "Dr. S. S. Injaganeri" ;
	educ.noOfStudents = 1500 ;
	
	educ.toGetKnowledge();
	System.out.println("Name of the college is "+ educ.name + "\n" + "No of departments are "+ educ.noOfDepartments + "\n" +"Name of the principle is "+ educ.nameOfPrinciple + "\n" +"No of students in college are "+ educ.noOfStudents) ;
	
	
	College educa = new College() ;
	educa.name = "Basaveshwara Degree College" ;
	educa.noOfDepartments = 3 ;
	educa.nameOfPrinciple = "Prof.M.C. Hallur" ;
	educa.noOfStudents = 250 ;
	
	educa.toGetKnowledge();
	System.out.println("Name of the college is "+ educa.name + "\n" + "No of departments are "+ educa.noOfDepartments + "\n" +"Name of the principle is "+ educa.nameOfPrinciple + "\n" +"No of students in college are "+ educa.noOfStudents) ;
	
	
	
	
	}


}