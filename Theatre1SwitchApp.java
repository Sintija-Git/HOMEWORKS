package Homeworks;
import java.util.Scanner;

/* Theatre1SwitchApp.java 
	-- prompts the user to input a day
	-- uses the instantiable class Theatre1Switch to determine the actual cost of a theatre ticket based on the given day
	*/
public class Theatre1SwitchApp {
	public static void main(String[] args) {

	// declare local variables
	String d;

	//declare and create an obj input of type Scanner to allow to use the keybord for user input
	Scanner input = new Scanner(System.in);

	//declare and create new Obj of type Theatre1Switch to asscess all methods in this claas
	Theatre1Switch checker = new Theatre1Switch ();

	// input  - prompt the user to enter the day when he wants to go to theatre
	System.out.println ("Which day would you like to see the play?");
	d = input.next().toLowerCase(); // get the users input and turn it into lower case so program can read it w/out problems

	//to assign/store in the instance variable day of the Obj checker the day provided by the user 
	//and save in the local variable day!!!
	checker.setDay(d);

	//processing 
	//call method switchStatement on obj checker to determine what message should be displayed
	checker.switchStatement();

	//retrieve the message and save it in variable m
	String m = checker.getPrice();
	System.out.println (m);


} //end main

} //end class

	