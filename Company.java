package Homeworks;
import java.util.Scanner;
public class Company {

        //declare and create 3 objects(as a employee1,2,3) and set params
        //set department for your employees
        //System.out.println("After 1 year inside the company:");
        //set to change your employee promotion from position to salary
        //calculate employees salary difference after 1 year
        //out print your employees

	public static void main(String[] args) {

			
		Scanner sc = new Scanner (System.in);
		
		//declare 3 obj as employee 1,2,3 and add parameters
		Employee e1 = new Employee ("Anton","manager","Telia", 2500);
		double s1 = e1.getSalary();
		e1.setDepartment("Sales");
	

		Employee e2 = new Employee ("Anna", "CSR", "Tele2", 1100);
		double s2 = e2.getSalary();
		e2.setDepartment("Customer service");
		
	
		Employee e3 = new Employee ("Annika", "HR", "Visma Enterprise", 1900);
		double s3 = e3.getSalary();
		e3.setDepartment("Human resources");
		
		
		System.out.println ("After 1 year inside the company: ");
		System.out.println();
		
		//set to change your employee promotion from position to salary
		e1.setPosition("CFO");
		e1.setSalary(6000);
		
		e2.setPosition("Senior CSR");
		e2.setSalary(2000);
		
		e3.setDepartment("Head of HR");
		e3.setSalary(3500);
		
		 //calculate employees salary difference after 1 year
		double s11 = e1.getSalary();
		double difference1 = s11 - s1;
		
		double s22 = e2.getSalary();
		double difference2 = s22 - s2;
		
		double s33 = e3.getSalary();
		double difference3 = s33 - s3;
		
		
		 //out print your employees
		System.out.println (e1);
		System.out.println (e2);
		System.out.println (e3);
		
		System.out.println();
		
		System.out.println ("ID number " + e1.getId() + ":"+ "\tsalary difference after 1 year in the company - " + difference1);
		System.out.println ("ID number " + e2.getId() + ":"+ "\tsalary difference after 1 year in the company - " + difference2);
		System.out.println ("ID number " + e3.getId() + ":"+ "\tsalary difference after 1 year in the company - " + difference3);
		
		
	} //end main

} //end class
