package View;

import java.util.Scanner;

import DataStructures.HourlyEmployee;
import DataStructures.SalariedEmployee;
import DataStructures.Student;
import Database.Database;

public class View {
	
	Database model  = new Database();
	Scanner scan = new Scanner(System.in);


	public View(){
		
	
		printWelcome();
		printChoices();
		
		int response=scan.nextInt();

		while (response != 3){
			if(response==1){
			   inputPerson();
			}
			if(response==2){
				model.printDatabase();
			}
			printChoices();
			response=scan.nextInt();
		}
	}
	
	public void printWelcome(){
		System.out.println("Welcome to the database!");
	}
	
	public void printChoices(){

		System.out.println();
		System.out.println("Would you like to: ");
		System.out.println("1. Input new people");
		System.out.println("2. View database");
		System.out.println("3. Exit");
	}
	
	public void inputPerson(){
		
		//People variables
		String phoneNum ="";
		char gender = 'o';
		String address = "";
		String name = "";
		int social = 0, age = 0;
		
	//	Scanner scan = new Scanner(System.in);
		int response;
		
		System.out.println();
		
		System.out.println("What is their gender?");
		System.out.println("1. Male");
		System.out.println("2. Female");
		System.out.println("3. Other");
		
		response = scan.nextInt();
		switch(response){
			case 1: 
				gender = 'm';
				break;	
		
			case 2:
				gender = 'f';
				break;
			
			case 3: gender = 'n';
				break;
		}
		scan.nextLine(); //need this to close scan after nextInt
		
		
		System.out.println("What is their name?");
		name = scan.nextLine();
		
		System.out.println("What is their age?");
		age = scan.nextInt();
		scan.nextLine(); 
		
		System.out.println("What is their address?");
		address = scan.nextLine();

		System.out.println("What is their phone number?");
		phoneNum = scan.next();
		
		System.out.println("What is their social security number?");
		social = scan.nextInt();
		scan.nextLine();
		
		System.out.println("What type of person are they?");
		System.out.println("1. Employee");
		System.out.println("2. Student");
		response = scan.nextInt();
		scan.nextLine();
		
		switch(response){
			case 1:
				String department = "";
				String jobTitle = "";
				int yearOfHire = 0;
				
				System.out.println("What department?");
				department = scan.nextLine();
				
				System.out.println("What is their job title?");
				jobTitle = scan.nextLine();
				
				System.out.println("In what year were they hired?");
				yearOfHire = scan.nextInt();
				scan.nextLine();
				
				System.out.println("What type of emlpoyee?");
				System.out.println("1. Hourly");
				System.out.println("2. Salaried");
				response = scan.nextInt();
				scan.nextLine();
				
				if(response ==1){
					
					int hourlyRate, hoursWorked, unionDues;
					
					System.out.println("What is their hourly rate?");
					hourlyRate = scan.nextInt();
					scan.nextLine();
					
					System.out.println("What is the number of hours worked per week?");
					hoursWorked = scan.nextInt();
					scan.nextLine();
					
					System.out.println("What are their union dues?");
					unionDues = scan.nextInt();
					scan.nextLine();
					
					HourlyEmployee hourly = new HourlyEmployee(name, age, gender, social, phoneNum, address,
							department, jobTitle, yearOfHire, hourlyRate, hoursWorked, unionDues);
					
					model.addHourly(hourly);
				}
				
				if(response==2){
					int annualSalary = 0;
					
					System.out.println("What is their annual salary?");
					annualSalary = scan.nextInt();
					scan.nextLine();
					
					SalariedEmployee sal = new SalariedEmployee(name, age, gender, social, phoneNum, address,
							department, jobTitle, yearOfHire, annualSalary);
					
					model.addSalaried(sal);
				}
				
				
				break;
				
			case 2:

				double gpa = 0.0;
				String major = "";
				int gradYear = 0;
				
				System.out.println("What is their GPA?");
				gpa = scan.nextDouble();
				scan.nextLine();
				
				System.out.println("What is their major?");
				major = scan.nextLine();
				
				System.out.println("What is their year of graduation?");
				gradYear = scan.nextInt();
				scan.nextLine();
				
				Student stud = new Student(name, age, gender, social, phoneNum, address,
						gpa, major, gradYear);
				
				model.addStudent(stud);
					
				break;
		}
	}
}
