package Database;

import java.util.ArrayList;

import DataStructures.HourlyEmployee;
import DataStructures.Person;
import DataStructures.SalariedEmployee;
import DataStructures.Student;

public class Database {
	
	private ArrayList<SalariedEmployee> salEmps = new ArrayList<SalariedEmployee>();
	private ArrayList<HourlyEmployee> hourEmps = new ArrayList<HourlyEmployee>();
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public Database(){
		salEmps.add(davidXiong);
		salEmps.add(pajLor);
		salEmps.add(dorisGuaman);
		
		hourEmps.add(pangnhiaLao);
		hourEmps.add(hannahDickinson);
		hourEmps.add(ryanHanson);
		
		students.add(richieThammavongsa);
		students.add(vanneckTiako);
		students.add(kongVang);
		
	}
	
	
	Person matt = new Person("Matt", 27, 'm', 123456789, "9523457218", "7411 85th Ave N Brooklyn Park, MN 55445");
	
	//Salaried Employees
	SalariedEmployee davidXiong = new SalariedEmployee("David Xiong", 20, 'm', 123456789, "6123459284", 
			"123 Main St. Brooklyn Park, MN 55445", "Upward Bound", "Office Assistant", 2014, 35000);
	
	SalariedEmployee pajLor = new SalariedEmployee("Paj Lor", 21, 'f', 123456321, "7633459284", 
			"2856 Logan Ave N. Minneapolis, MN 55445", "Upward Bound", "Office Assistant", 2013, 40000);
	
	SalariedEmployee dorisGuaman = new SalariedEmployee("Doris Guaman", 21, 'f', 983456789, "9523458274", 
			"4255 Johnson St. Anoka, MN 55446", "Upward Bound", "Assistant Director", 2014, 35000);
	
	//Hourly Employees
	HourlyEmployee pangnhiaLao = new HourlyEmployee("Panghia Lao", 21, 'f', 984329584, "6513245782",
			"4392 South St. Fridley, MN 55410", "SSS/TRIO", "Receptionist", 2014, 12, 25, 250);

	HourlyEmployee hannahDickinson = new HourlyEmployee("Hannah Dickinson", 19, 'f', 19843584, "9529228345",
			"1458 Monroe St NE Minneapolis, MN 55413", "SSS/TRIO", "Receptionist", 2015, 12, 25, 250);

	HourlyEmployee ryanHanson = new HourlyEmployee("Ryan Hanson", 40, 'm', 948349431, "9524124133",
			"8932 85th Ave N Brooklyn Park, MN 55445", "SSS/TRIO", "Writing Tutor", 2012, 15, 40, 350);
	
	//Students
	Student vanneckTiako = new Student("Vanneck Tiako", 20, 'm', 493821205, "4187623498",
			"7098 Plymouth Lane Plymouth, MN 55243", 3.8, "Computer Science", 2017);
	
	Student kongVang = new Student("Kong Vang", 22, 'm', 214953825, "2123457283",
			"1582 Polly Lane Shoreview, MN 55367", 3.5, "Education", 2018);
	
	Student richieThammavongsa = new Student("Richie Thammavongsa", 22, 'm', 734627348, "6513247832",
			"2234 Webster Ave N Champlin Park, MN 55678", 2.8, "Nursing", 2020);
	
	
	//add new people
	public void addHourly(HourlyEmployee hourly){
		hourEmps.add(hourly);
	}
	
	public void addSalaried(SalariedEmployee sal){
		salEmps.add(sal);
	}
	
	public void addStudent(Student stud){
		students.add(stud);
	}
	
	
	
	//print methods
	public void printDatabase(){
		System.out.printf("%s%n", "Salaried Employees");
		System.out.println();
		System.out.printf("%-25s%-7s%-7s%-45s%-15s%-15s%-15s%-25s%-15s%-10s%n", "Name", "Gender", "Age", "Address", 
				"SSN", "Phone Number", "Department", "Job Title", "Year of Hire", "Salary" );
		for (SalariedEmployee sal : salEmps){
			printSalariedEmployee(sal);
		}
		System.out.println();
		System.out.printf("%s%n", "Hourly Employees");
		System.out.println();
		System.out.printf("%-25s%-7s%-7s%-45s%-15s%-15s%-15s%-25s%-15s%-15s%-15s%-15s%n", "Name", "Gender", "Age", "Address", 
				"SSN", "Phone Number", "Department", "Job Title", "Year of Hire", "Hourly Rate", "Hours Worked", "Union Dues" );
		for (HourlyEmployee hour : hourEmps){
			printHourlyEmployee(hour);
		}
		System.out.println();
		System.out.printf("%s%n", "Students");
		System.out.println();
		System.out.printf("%-25s%-7s%-7s%-45s%-15s%-15s%-15s%-20s%-15s%n", "Name", "Gender", "Age", "Address", 
				"SSN", "Phone Number", "GPA", "Major", "Grad Year");
		for (Student stud : students){
			printStudents(stud);
		}

		
	}
	
	public void printSalariedEmployee(SalariedEmployee sal){
		System.out.printf("%-25s%-7c%-7d%-45s%-15d%-15s%-15s%-25s%-15d%-10d%n", sal.getName(), sal.getGender(), 
				sal.getAge(), sal.getAddress(), sal.getSocial(), sal.getPhoneNum(), sal.getDepartment(), 
				sal.getJobTitle(), sal.getYearOfHire(), sal.getAnnualSalary());
		
	}
	
	public void printHourlyEmployee(HourlyEmployee hour){
		System.out.printf("%-25s%-7c%-7d%-45s%-15d%-15s%-15s%-25s%-15d%-15d%-15d%-15d%n", hour.getName(), hour.getGender(), 
				hour.getAge(), hour.getAddress(), hour.getSocial(), hour.getPhoneNum(), hour.getDepartment(), 
				hour.getJobTitle(), hour.getYearOfHire(), hour.getHourlyRate(), hour.getHoursWorked(), hour.getUnionDues());
	}
	
	public void printStudents(Student stud){
		System.out.printf("%-25s%-7s%-7s%-45s%-15s%-15s%-15f%-20s%-15d%n", stud.getName(), stud.getGender(), stud.getAge(), stud.getAddress(), 
				stud.getSocial(), stud.getPhoneNum(), stud.getGpa(), stud.getMajor(), stud.getGradYear());
	}

}
