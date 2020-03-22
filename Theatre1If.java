package Homeworks;

/** 
More Problems on Selection Statements
Problem 1: 
Your local theatre charges different prices during the week and during the weekends.  The prices are outlined in the table below:
Day:				Price:
Monday - Thursday		€20
Friday - Sunday			€30
You have been asked to develop an application that allows a user to enter the day of the week and then display the cost of a theatre ticket for that person based on the day of the week. 
Use instantiable classes in your application.  Save the instantiable class as Theatre1.java
Theatre1IfApp.java 
	-- prompts the user to input a day
	-- uses the instantiable class Theatre1If to determine the actual cost of a theatre ticket based on the given day
*/
public class Theatre1If {
	//declare instance variable
private String day;
private String message;

	// create constructor w/out any value
public Theatre1If ( ) {
	
}
	// declare setter method for day instance variable
public void setDay (String d) {
	day = d;
}

	//our if statements method called ifStatement
public void ifStatement() {
	// if-else if decision structure	
if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday")) {
	message = "The price for your ticket will be €20";
	} else if (day.equalsIgnoreCase("friday") || day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
	message = "The price for your ticket will be €30";
	}

}

	//declare getter () to retrieve the message
public String getPrice() {
return message;
}

	

} //end class
