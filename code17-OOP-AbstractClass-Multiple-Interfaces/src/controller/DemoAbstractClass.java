package controller;

import model.SchoolComputingDepartment; //abstract class
import model.SEDepartment; //implemented class
import model.WDDepartment; //implemented class
import model.GDDepartment; //implemented class

public class DemoAbstractClass {

	public static void main(String[] args) {
		//an abstract class cannot be instantiated
		//SchoolComputingDepartment scd = new SchoolComputingDepartment();
		
		//can still perform thru object polymorphism widening
		/*SchoolComputingDepartment scd = new SEDepartment();
		scd = new WDDepartment();
		scd = new GDDepartment();*/
		
		//perform announcements per department
		System.out.println("These are all announcements from the SE Department");
		SEDepartment sed = new SEDepartment();
		sed.schoolTerm();
		sed.submitGrades();
		sed.submitSoftCopyFinalGrades();
		sed.doFinalGradeConsultation();
		sed.studentsShouldFollow();
		sed.beRemindedSchoolEnrollmentForNextTerm();
		
		
		System.out.println("\n\nThese are all announcements from the WD Department");
		WDDepartment wdd = new WDDepartment();
		wdd.schoolTerm();
		wdd.submitGrades();
		wdd.submitSoftCopyFinalGrades();
		wdd.doFinalGradeConsultation();
		wdd.studentsShouldFollow();
		wdd.beRemindedSchoolEnrollmentForNextTerm();
		
		System.out.println("\n\nThese are all announcements from the GD Department");
		GDDepartment gdd = new GDDepartment();
		gdd.schoolTerm();
		gdd.submitGrades();
		gdd.submitSoftCopyFinalGrades();
		gdd.doFinalGradeConsultation();
		gdd.studentsShouldFollow();
		gdd.beRemindedSchoolEnrollmentForNextTerm();
	}
}
