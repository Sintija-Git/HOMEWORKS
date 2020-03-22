package Homeworks;
import java.util.Scanner;

public class Theatre1IfApp {

	/*Theatre1IfApp.java 
	-- prompts the user to input a day
	-- uses the instantiable class Theatre1If to determine the actual cost of a theatre ticket based on the given day
*/
	public static void main(String[] args) {
		
// declare local variables
String day;


//declare and create an obj input of type Scanner to allow to use keybord for user input
Scanner input = new Scanner(System.in);

//declare and create new Obj of type TheatreIf1 to asscess all methods in this claas
Theatre1If checker = new Theatre1If ();

// input  - prompt the user to enter the day when he wants to go to theatre
System.out.println ("Which day would you like to see the play?");
day = input.next(); // get the users input 

//to assing/store in the instance variable day of the Obj checker the weekday provided by the user 
//and save in the local variable day!!!
checker.setDay (day);

//processing 
//call method ifStatement on obj checker to determine what message should be displayed
checker.ifStatement();

//retrieve the message  and save it in variable m
String m = checker.getPrice();
System.out.println (m);


	} //end main

} //end class
