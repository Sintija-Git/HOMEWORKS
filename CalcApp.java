package Homeworks;
import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// local variables
		int numbers[];

		
		Scanner sc = new Scanner (System.in); //create scanner
		System.out.println ("Enter the size of our array: "); //get user input
		int size = sc.nextInt();
		numbers = new int [size];
	
		AvgMaxMin myCalc = new AvgMaxMin(); //to access the class AvgMaxMin
		
		for (int i = 0; i <size; i++ ) {
			System.out.println ("Enter the number " + (i+1));
			numbers[i] = sc.nextInt();
		}// end for
		
		
			myCalc.setNumbers(numbers);
			myCalc.calcAvg();
			double avg = myCalc.getAverage();
			System.out.println ("The average is " + avg);
			
			
			myCalc.calcMax();
			double m = myCalc.getMax();
			System.out.println("The max value is " + m);
			
			myCalc.calcMin();
			int min = myCalc.getMin();
			System.out.println ("The min value is " + min);
		
		
	}//end main

} //end class
