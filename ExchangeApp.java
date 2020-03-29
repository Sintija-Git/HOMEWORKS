package Homeworks;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ExchangeApp {

public static DecimalFormat dd = new DecimalFormat ("#.##");


	public static void main(String[] args) {
		// local variables
		
		double amount;
		double rate;
		
		// declare objects 2
		Scanner sc = new Scanner (System.in);
		Exchange ex = new Exchange (); //accessing class Exchange and all its methods variables
		
		//User input and
		//set m to put what we got form the scanner into calculation
		System.out.println("\tPlease enter amount you want to convert: ");
		amount = sc.nextDouble();
		
		ex.setAmount(amount);
		
		System.out.println("\tPlease enter the conversion rate: ");
		rate = sc.nextDouble();
		
		ex.setRate(rate);	

		//process
		ex.calculation();
		
		// output or get method
		double x = ex.getConversion();
		System.out.println (+ amount + " at the rate of " + rate + " is " + dd.format(x));	
		

	} //end main

} //end class
