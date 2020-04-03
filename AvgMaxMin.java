package Homeworks;

public class AvgMaxMin {
	
private int numbers[];
private double average;
private int max;
private int min;


public AvgMaxMin () {}


public void setNumbers(int[] numbers) {
	this.numbers = numbers;
}

public void calcAvg () {
	int sum = 0; //default sum value is 0
	
	for (int i = 0; i< numbers.length; i++) {
		sum = sum + numbers[i]; // adds the first number of i 0
	} //end for
	average = sum/ numbers.length; //calculates the average of all numbers entered by user
	
} //end calcAvg
	
	public double getAverage() { // getter for average result
		return average;
	} 
	
	
public void calcMax () {
		max = numbers[0];
		for (int i = 0; i < numbers.length; i++ ) {
			if (max < numbers[i]) {
				max = numbers[i];
			} //end if
		}//end for
} //end calcMax

	public int getMax() {
		return max;
	}
	
public void calcMin ()	{
	min = numbers[0];
	for (int i = 0; i <numbers.length; i++) {
		if (min > numbers[i]) {
		min = numbers[i];
		} // end if
	} //end for
} //end calcMin
	
	public int getMin () {
		return min;
	}
	
} //end class
