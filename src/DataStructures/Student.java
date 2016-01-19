package DataStructures;

public class Student extends Person {
	
	private double gpa;
	private String major;
	private int gradYear;
	
	public Student (String name, int age, char gender, int social, String phoneNum, 
			String address, double gpa, String major, int gradYear) {
		
		super(name, age, gender, social, phoneNum, address);
		this.gpa = gpa;
		this.major = major;
		this.gradYear = gradYear;
		
	}
	
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGradYear() {
		return gradYear;
	}

	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}
	
}
