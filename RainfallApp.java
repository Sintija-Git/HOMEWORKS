package Homeworks;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RainfallApp {

	private static DecimalFormat df2 = new DecimalFormat ("#.##");
	
	public static void main(String[] args) {
		// declare local variables
		double rf [][];
		
		Scanner sc = new Scanner (System.in); //create Scanner
		
		//ask for users input
		System.out.println ("Please enter the number of weeks: ");
		int weeks = sc.nextInt();
		
		System.out.println ("Please enter the number of days in a week: ");
		int days = sc.nextInt();
		
		
		
		rf = new double [weeks][days];
		for (int row = 0; row < rf.length; row++) {
			for (int col = 0; col < rf[row].length; col++) {
			System.out.print ("Please enter the rainfall value of weeks " + (row+1) + " day " + (col+1) + " : ");
			rf[row][col] = sc.nextDouble();
			}
		} //end for
		
		RainfallAvgMaxMin myCalc = new RainfallAvgMaxMin (); //to access instantiable class
		
		myCalc.setRainfall(rf); //access setters
		myCalc.calcAvg(); //access Avg
		myCalc.calcMax(); //access Max
		myCalc.calcMin(); //access Min
		
		//output 
		System.out.println ("______________________________");
		System.out.println ();
		System.out.println ("The average is: " + df2.format(myCalc.getAvg())); 
		System.out.println ("The max value is: " + myCalc.getMax());
		System.out.println  ("The min value is: " + myCalc.getMin());
		System.out.println ();
		System.out.println ("______________________________");
		System.out.println ();
		
		System.out.print ("The rainfall values are: \n"); //to show all input from user in rows and columns
		for (int row = 0; row < rf.length; row++) {
			for (int col = 0; col < rf[row].length; col++) {
		System.out.print(rf[row][col] + " ");
			}
			System.out.println ();
			}//end for
		
	} //end main

} //end class
