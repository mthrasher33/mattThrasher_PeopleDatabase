package DataStructures;

public class SalariedEmployee extends Employee {
	
	private int annualSalary;

	public SalariedEmployee(String name, int age, char gender, int social, String phoneNum, String address,
			String department, String jobTitle, int yearOfHire, int annualSalary){
		
		super(name, age, gender, social, phoneNum, address, department, jobTitle, yearOfHire);
		this.annualSalary = annualSalary;
		
	}
	
	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

}
