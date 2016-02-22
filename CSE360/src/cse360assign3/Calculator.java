package cse360assign3;
/** Calculator will perform basic mathematical functions with values inserted through function calls.
 *  on an object of type Calculator.
 * 
 * @author Fabian Hinojosa PIN: 407
 * @version Feb 21, 2016.
 */


public class Calculator {
	/**
	 * total will be the value returned for every call from a function
	 */
	private int total;
	
	/**
	 * Calculator() is a constructor that generates and object of type calculator with the int total 
	 * variable initialized as 0
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}

	/**
	 * getTotal() will allow for the calling of the private value total to be called outside of this scope
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add() simply adds the parameter value to total
	 * @param value
	 */
	public void add (int value) {
		int temp = total;
		total = temp + value;
	}
	
	/**
	 * subtract() simply subtracts the parameter value from total
	 * @param value
	 */
	public void subtract (int value) {
		int temp = total;
		total = temp - value;
	}
	
	/**
	 * multiply() finds the product of value and total
	 * @param value
	 */
	public void multiply (int value) {
		int temp = total;
		total = temp * value;
	}
	
	/**
	 * divide() divides the total by the value
	 * @param value
	 */
	public void divide (int value) {
		if(value != 0){
			int temp = total;
			total = temp/value;
		}
		else{
			total = 0;
		}
	}
	
	/**
	 * getHistory() will return a string of all the functions that have been called in order
	 * @return
	 */
	public String getHistory () {
		return "";
	}

}