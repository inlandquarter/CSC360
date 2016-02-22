package cse360assign3;

public class CalcTester {
	public static void main(String args[]){
		Calculator clc = new Calculator();
		clc.add(3);
		clc.subtract(2);
		clc.multiply(5);
		clc.multiply(10);
		clc.subtract(1);
		clc.divide(7);
		clc.divide(0);
		clc.add(30);
		System.out.println(clc.getHistory());
		
		
		Calculator myCalculator = new Calculator();
		myCalculator.add (4);
		myCalculator.subtract (2);
		myCalculator.multiply (2);
		myCalculator.add(5);

		System.out.println(myCalculator.getHistory());
	}
	
}
