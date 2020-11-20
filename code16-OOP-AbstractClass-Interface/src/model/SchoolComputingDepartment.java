package model;

abstract public class SchoolComputingDepartment  {

	public SchoolComputingDepartment() {
		//System.out.println("This is the SchoolComputingDepartment default/no-arg constructor.");
	}
	
	public void schoolTerm() {
		System.out.println("All online classes will end by December 7.");
	}
	
	abstract public void submitGrades();
	
	abstract public void submitSoftCopyFinalGrades();
	
	abstract public void doFinalGradeConsultation();
	
}
