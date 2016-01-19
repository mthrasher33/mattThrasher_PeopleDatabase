package DataStructures;

public class HourlyEmployee extends Employee {

	private int hourlyRate, hoursWorked, unionDues;
	
	public HourlyEmployee(String name, int age, char gender, int social, String phoneNum, String address,
			String department, String jobTitle, int yearOfHire, int hourlyRate, int hoursWorked, int unionDues){
		
		super(name, age, gender, social, phoneNum, address, department, jobTitle, yearOfHire);
		
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.unionDues = unionDues;
		
	}
	
	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getUnionDues() {
		return unionDues;
	}

	public void setUnionDues(int unionDues) {
		this.unionDues = unionDues;
	}

}
