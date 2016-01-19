package DataStructures;

public class Employee extends Person {
	
	private String department, jobTitle;
	private int yearOfHire;
	
	public Employee (String name, int age, char gender, int social, String phoneNum, String address,
			String department, String jobTitle, int yearOfHire){
		
		super(name, age, gender, social, phoneNum, address);
		this.department = department;
		this.jobTitle = jobTitle;
		this.yearOfHire = yearOfHire;	
		
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getYearOfHire() {
		return yearOfHire;
	}

	public void setYearOfHire(int yearOfHire) {
		this.yearOfHire = yearOfHire;
	}

}
