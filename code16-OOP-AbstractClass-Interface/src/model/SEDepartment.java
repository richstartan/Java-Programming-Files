package model;

public class SEDepartment extends SchoolComputingDepartment implements ROAnnouncement {

	private String name = null;
	
	public SEDepartment() {
		this.name = "Sir Bennett Tanyag";
	}
	
	@Override
	public void submitGrades() {
		System.out.println("All faculty members who are handling SE subjects "
			+ "must submit their final grades on or before December 11 for my "
			+ "review and approval. - " + this.name);
	}

	@Override
	public void submitSoftCopyFinalGrades() {
		System.out.println("All faculty members who are handling SE subjects "
			+ "must submit their soft copy of final grades to the RO on or "
			+ "before " + DATE_OF_FINAL_GRADE_SUBMISSION + ". - " + this.name);
	}

	@Override
	public void doFinalGradeConsultation() {
		System.out.println("All faculty members who are handling SE subjects "
			+ "must perform final grade consultation with their students on "
			+ "or before December 7 - " + this.name);
	}

	@Override
	public void studentsShouldFollow() {
		System.out.println("Students must follow all the deadlines set "
			+ "for the grade consultation for this 1st Term AY " + ACADEMIC_YEAR 
			+ " - " + name);
	}

	@Override
	public void beRemindedSchoolEnrollmentForNextTerm() {
		System.out.println("The start of class for 2nd Term AY " + ACADEMIC_YEAR 
			+ " is " + CLASS_RESUMPTION + " - " + name);
	}
}
