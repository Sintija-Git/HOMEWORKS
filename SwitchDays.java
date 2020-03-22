package Homeworks;
/** Home Work:
Write an application that prompts a student to input a day of the week, and then it will display whether there are classes scheduled for that day.
Day        Message
Monday:	Evening classes at 19:00
Tuesday:   No classes
Wednesday:	Evening classes at 19:00
Thursday:  No classes
Friday:	No classes
Saturday:	Whole day Labs :)
Sunday:	It's finally Sunday! : default:   check your input mate/fella/gal
*/
import java.util.Scanner;
public class SwitchDays {
	
	 
		
   public static void main(String args[]){
	// declare a variable to store the day entered by the user
	   String day;
	  
    // declare a variable named scan to be able to work with objects of type Scanner
	   Scanner scan;
	  
	// create a Scanner object to read input from the keyboard
	  scan = new Scanner(System.in);
	  
	// prompt the user to enter a day of the week
	  System.out.println("Please enter a day of the week to see whether there are any classes scheduled for that day");
	  
	 // read the string provided by the user - all input will read in lower case!
	 // we know that Java is case sensitive, therefore let's convert the word provided by the user to lower case so that the program works independent of the way the user writes the word e.g. Monday, monDAY, MoNdAy
	  day = scan.next().toLowerCase();
	  
//	  OTHER OPTION THAT WORKS AS WELL
///   day = scan.next();
//	  day = day.toLowerCase();
	  
    
	//create the output user gets after entering day with switch method! *use brake to separate statements 
	//note: a switch statement accepts a constant expression/variable of type String only starting with Java version 7; in earlier versions the compiler shows an "incompatible types" error.
	  switch (day) {
	  case "monday":
	  case "wednesday":
		  System.out.println("Evening classes at 19:00");
		  break;
	  case "tuesday":
	  case "thursday":
	  case "friday":
		  System.out.println("No classes");
		  break;
	  case "saturday":
		  System.out.println("Whole day Labs :) ");
		  break;
	  case "sunday":
		  System.out.println("It's finally Sunday!");
		  break;
		  default:
			  System.out.println ("Check your input mate!");
		  
	  }
      
   }

}
