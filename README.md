# mattThrasher_PeopleDatabase

This is a database designed for a school system that stores information for students and employess. The database uses polymorphism to provide
common and unique attributes for each type of person in the database.
All classes inherit from the Person object. 
  Each person has basic contact information as well as gender, social security numbers, and phone numbers.
Students inherit from the Person object.
  Each student has a GPA, intended major, and graduation date.
Employees inherit from the Person object.
  Each employee has a job title, department, and date of hire.
  There are two types of employees:
    Salaried employees have an annual salary.
    Hourly employees have an hourly rate, hours worked, and union dues.
    
The database serves as the model, while the view uses the Java console. Users can print the database into the console as well as
enter new users into the database. Dummy data is provided to demonstrate the printing capacities of the project.

