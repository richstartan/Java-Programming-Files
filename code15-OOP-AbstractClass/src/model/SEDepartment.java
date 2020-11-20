package model;

public class SEDepartment extends SchoolComputingDepartment {

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
			+ "before December 12. - " + this.name);
	}

	@Override
	public void doFinalGradeConsultation() {
		System.out.println("All faculty members who are handling SE subjects "
			+ "must perform final grade consultation with their students on "
			+ "or before December 7 - " + this.name);
	}
}