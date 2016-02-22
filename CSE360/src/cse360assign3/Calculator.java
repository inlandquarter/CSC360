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
		return 0;
	}
	
	/**
	 * add() simply adds the parameter value to total
	 * @param value
	 */
	public void add (int value) {
	}
	
	/**
	 * subtract() simply subtracts the parameter value from total
	 * @param value
	 */
	public void subtract (int value) {
	}
	
	/**
	 * multiply() finds the product of value and total
	 * @param value
	 */
	public void multiply (int value) {
	}
	
	/**
	 * divide() divides the value into total
	 * @param value
	 */
	public void divide (int value) {
	}
	
	/**
	 * getHistory() will return a string of all the functions that have been called in order
	 * @return
	 */
	public String getHistory () {
		return "";
	}

}