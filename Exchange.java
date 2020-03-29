package Homeworks;

public class Exchange {
//declare data members amount, rate, conversion
	private double amount;
	private double rate;
	private double conversion; //final
	
	public Exchange() { //empty
		
	}
	
	public Exchange(double amount, double rate) { //declare constr with 2 values
		this.amount = 200;
		this.rate = 15.50;
	}
	
	//declare set method for both amount and rate that are gonna be provided by user
	public void setAmount (double amount) {
		this.amount = amount;
	}
	
	public void setRate (double rate) {
		this.rate = rate;
	}
	
	// calculation = conversion
	public void calculation () {
		conversion = amount * rate;
	}
	
	// get method to get calculation; return conversion
	public double getConversion () {
		return conversion;
	}
	
	
} //end class
