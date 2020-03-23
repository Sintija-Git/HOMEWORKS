package Homeworks;
import java.util.Scanner;

/*Use instantiable classes in your application. Save the instantiable class as Theatre2.java
Theatre2App.java 
	-- prompts the user to input a day and the age of the customer
	-- uses the instantiable class Theatre2 to determine the actual cost of a theatre ticket based on the given day and age
public class Theatre2App {
*/
public class Theatre2App {

	public static void main(String[] args) {
		//declare local variables
		int age;
		String day;
		String message;
		
		//create variable scan of type Scanner
		Scanner scan = new Scanner (System.in);
		
		//create a variable showPrice of type Theatre2
		Theatre2 showPrice = new Theatre2();
		
		//get user input aka age and day via keyboard
		System.out.println ("Enter the day you want to see the play here: ");
		day = scan.next();
		
		System.out.println("Enter your age here: ");
		age = scan.nextInt();
		
		//to store in the instance variable day/age of the Obj showPrice the info provided by the user 
		//and save in the local variable day/age!!!
		showPrice.setDay(day);
		showPrice.setAge(age);
		
		////processing -  call the method from class Theatre2 called computeIf 
		showPrice.computeIf();
		
		
		//get method to retreive the message with the price and store it in p
		String p = showPrice.getPrice();
		System.out.println(p);
		
		
		} //end main

	
	}//end body

