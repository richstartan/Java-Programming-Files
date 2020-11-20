package model;

/*abstract*/ public class WDDepartment extends SchoolComputingDepartment{

	private String name = null;
	
	public WDDepartment() {
		this.name = "Sir Bennett Tanyag";
	}
	
	@Override
	public void submitGrades() {
		System.out.println("All faculty members who are handling WD subjects "
			+ "must submit their final grades on or before December 10 for my "
			+ "review and approval. - " + this.name);
	}

	@Override
	public void submitSoftCopyFinalGrades() {
		System.out.println("All faculty members who are handling WD subjects "
			+ "must submit their soft copy of final grades to the RO on or "
			+ "before December 12. - " + this.name);
	}

	@Override
	public void doFinalGradeConsultation() {
		System.out.println("All faculty members who are handling WD subjects "
			+ "must perform final grade consultation with their students on "
			+ "or before December 4 - " + this.name);
	}
}
