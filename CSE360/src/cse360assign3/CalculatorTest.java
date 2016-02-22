package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void Calculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	@Test
	public void getTotal() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
	}
	@Test
	public void add() {
		Calculator calc = new Calculator();
		calc.add(10);
		assertEquals(10, calc.getTotal());
	}
	@Test
	public void subtract() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.subtract(5);
		assertEquals(5, calc.getTotal());
	}
	@Test
	public void multiply() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.multiply(5);
		assertEquals(25, calc.getTotal());
	}
	@Test
	public void divide() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.divide(2);
		assertEquals(5, calc.getTotal());
		
		calc.divide(0);
		assertEquals(0, calc.getTotal());
	}
	@Test
	public void getHistory() {
		fail("Not yet implemented");
	}

}
