package Homeworks;

public class RainfallAvgMaxMin {
		//declare instance variables
	
		private double rainfall[][];
		private double avg;
		private double max;
		private double min;
		
		//default constructor
		public RainfallAvgMaxMin () {}
		
		//getters for avg, max, min
		public double getAvg() {
			return avg;
		}
		public double getMax() {
			return max;
		}
		public double getMin() {
			return min;
		}
		
		//setters for rainfall[]
		public void setRainfall(double[][] rainfall) {
			this.rainfall = rainfall;
		}
		
		
		public void calcAvg () {
			double sum =0.0;
			int counter = 0;
			for (int row = 0; row < rainfall.length; row++) {
				for (int col = 0; col < rainfall[row].length; col++) {
					sum = sum + rainfall[row][col];
					counter++;
				}
			} // end for
			avg = sum /counter;
		} // end calcAvg
		
		
		public void calcMax () {
			 max = rainfall [0][0];
			
			 for (int row = 0; row < rainfall.length; row++) {
				 for (int col = 0; col < rainfall[row].length; col++) {
					 if (max < rainfall[row][col]) {
						 max = rainfall[row][col];
					 } //end if statement
				 } //end for inner
			 } //end for outer
		} //end calcMax
		
		
		public void calcMin () {
			min = rainfall [0][0];
			
			for (int row = 0; row < rainfall.length; row++) {
				for (int col = 0; col < rainfall[row].length; col++) {
					if (min >  rainfall[row][col]) {
						min =  rainfall[row][col];
					} //end if statement
				} //end inner loop
			} //end outer loop	
		} //end calcMin

		
		
		
		
} //end class
