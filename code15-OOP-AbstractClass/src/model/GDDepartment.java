package model;

public class GDDepartment extends SchoolComputingDepartment {

	private String name = null;
	
	public GDDepartment() {
		this.name = "Sir Carl So";
	}
	
	@Override
	public void submitGrades() {
		System.out.println("All faculty members who are handling GD subjects "
			+ "must submit their final grades on or before December 12 for my "
			+ "review and approval. - " + this.name);

	}

	@Override
	public void submitSoftCopyFinalGrades() {
		System.out.println("All faculty members who are handling GD subjects "
			+ "must submit their soft copy of final grades to the RO on or "
			+ "before December 12. - " + this.name);

	}

	@Override
	public void doFinalGradeConsultation() {
		System.out.println("All faculty members who are handling SE subjects "
			+ "must perform final grade consultation with their students on "
			+ "or before December 11 - " + this.name);
	}
}
