package au.com.myob.service;

import static org.junit.Assert.*;

import org.junit.Test;
import au.com.myob.fixture.GrossIncomeCalculatorFixture;

public class SuperCalculatorTest {
	
	
	private SuperCalculator calculator;

	@Test
	public void shouldCalculateSuperBasedOnGrassIncomeAndSuper(){
		GrossIncomeCalculator grossIncome = GrossIncomeCalculatorFixture.get().withIncomeByAnnualSalary(60050).build();
		calculator = new SuperCalculator(9, grossIncome);
		assertEquals(450, calculator.calculate());
	}

}
