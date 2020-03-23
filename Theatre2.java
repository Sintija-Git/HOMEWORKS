package Homeworks;

/** 
More Problems on Selection Statements
Problem 2: 
The theatre has now decided to charge based both on the day of the week and on the age of the customer. The new table of prices is outlined below:
Day:				    Age			    Price:
Monday - Thursday   Under 5/Over 65		Free
                    5 – 15			    €15
                    15 - 65			    €20
Friday - Sunday		Under 5/Over 65		€5
                    5 – 15			    €20
                    15 - 65			    €30
Use instantiable classes in your application. Save the instantiable class as Theatre2.java
Theatre2 -- the instantiable class, uses 2 nested if else selection statements to determine the cost of a theatre ticket based on a given day and a customer's age
*/

public class Theatre2 {
	
	private String message;
	private String day;
	private int age;
	
	//declare empty constructor
	public Theatre2 () {
	}
	
	//set for day and age
	public void setDay (String day)	{
		this.day = day;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
			
	
	public void computeIf () {
		if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thurstay")) {
			if (age < 5 || age > 65) {
			message = "Your ticket is for free";
		} else if (age <= 15) {
			message = "Your ticket will cost 15 EUR";
		} else { 
			message = "Your ticket will cost 20 EUR";
		}
				
		} else if (day.equalsIgnoreCase("friday") || day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
			if (age < 5 || age > 65) {
				message = "Your ticket will cost 5 EUR";
			}else if (age <= 15) {
			message = "Your ticket will cost 20 EUR";
			} else {
				message = "Your ticket will cost 30 EUR";
			}
		}
	}
		
//		} else if (age <= 65) {
//			message = "Your ticket will cost 20 EUR";
//		}
		
	
	
	// get for message with price
	public String getPrice () {
		return message;
	}

	
	}

	


