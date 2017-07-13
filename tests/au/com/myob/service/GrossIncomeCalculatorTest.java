package au.com.myob.service;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GrossIncomeCalculatorTest {

	private GrossIncomeCalculator calculator;

	@Before
	public void setUp(){
		this.calculator = new GrossIncomeCalculator();
	}
	
	@Test
	public void shouldReturnTheGrossIncomeFromAnnualSalary(){
		assertEquals(5004, calculator.calculate(60050.00));
	}
}
