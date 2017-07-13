package au.com.myob.tax.income;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import au.com.myob.tax.income.ThirdLevelIncomeTax;

public class ThirdLevelIncomeTaxTest {
	
	private ThirdLevelIncomeTax tax;
	
	@Before
	public void setup(){
		tax = new ThirdLevelIncomeTax();
	}

	@Test
	public void shouldReturnRoundedIncomeTaxeBasedOnAnnualSalary(){
		assertEquals(922, tax.calculateTax(60050));
	}

}
