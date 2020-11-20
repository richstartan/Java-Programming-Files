package model;

public interface ROAnnouncement {
	
	//all variables automatically (implicitly) declared as public static final 
	String ACADEMIC_YEAR = "AY 2020-2021";
	String CLASS_RESUMPTION = "January 11, 2021";
	String DATE_OF_FINAL_GRADE_SUBMISSION = "December 12, 2020";
	
	//all methods are automatically (implicitly) declared as public abstract
	void studentsShouldFollow();
	void beRemindedSchoolEnrollmentForNextTerm();
}
