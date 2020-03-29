package Homeworks;

    //instance variables for id, name, position, department, company, salary
    //constructor with 4 params, except id and department
    //inside the constructor generate a random number between 1 and 100 as ID number /from GuessNumber
    //inside the constructor provide a message for department "Department not yet assigned";
    //declare set get Methods for department, position, salary
    //Override all toString method for better explanation about our object

public class Employee {
	
// declare instance variables
private int id;
private String name;
private String position;
private String department;
private String company;
private double salary, salDiff;

public Employee (String name, String position, String company, double salary) {
	this.name = name;
	this.position = position;
	this.company = company;
	this.salary = salary;
	
	 //inside the constructor generate a random number between 1 and 100 as ID number /from GuessNumber
	double r1 = Math.random(); //check if need s/thing extra for generating random
	double r2 = r1 * 999;
	double r3 = r2 + 1;
	id = (int) r3;

	//inside the constructor provide a message for department "Department not yet assigned";
	this.department = ("Department not yet assigned");
	
} //end constructor


//declare set get Methods for department, position, salary
public String getPosition() {
	return position;
}

public void setPosition(String position) {
	this.position = position;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public int getId () {
	return id;
}


//Override all toString method for better explanation about our object
public String toString() {
	return "[id: " + id + ", name: " + name + ", position: " + position + ", department: " + department + ", company: " + company +
			", salary: " + salary + "]";
}



} // end class
