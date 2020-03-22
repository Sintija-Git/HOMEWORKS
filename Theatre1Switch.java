package Homeworks;

/** 
More Problems on Selection Statements
Problem 1: 
Your local theatre charges different prices during the week and during the weekends.  The prices are outlined in the table below:
Day:				Price:
Monday - Thursday		€20
Friday - Sunday			€30
You have been asked to develop an application that allows a user to enter the day of the week and then display the cost of a theatre ticket for that person based on the day of the week. 
Use instantiable classes in your application.  Save the instantiable class as Theatre1Switch.java
Theatre1SwitchApp.java 
	-- prompts the user to input a day
	-- the instantiable class, uses the switch selection statement to determine the price of a theatre ticket based on a given day
*/
public class Theatre1Switch {
	//declare instance variable
private String day;
private String message;

	// create constructor w/out any value
public Theatre1Switch ( ) {
	
}
	// declare setter method for day instance variable
public void setDay (String day) {
	this.day = day;
}
	
//	//our if statements method called SwitchStatement
public String switchStatement (){
	// Switch case  structure	
	switch (day) {
	case "monday":
	case "tuesday":
	case "wednesday":
	case "thursday":
		message = "The price for your ticket will be €20";
		break;
	case "friday":
	case "saturday":
	case "sunday":
		message = "The price for your ticket will be €30";
		break;
		default:
			message = "Please check whether your input is correct!";
	}
	return day;
		

}

	//declare getter () to retrieve the message
public String getPrice() {
return message;
}


}//end class
