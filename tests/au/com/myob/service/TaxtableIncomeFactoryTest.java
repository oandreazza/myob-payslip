package au.com.myob.service;

import static org.junit.Assert.*;
import org.junit.Test;

import au.com.myob.tax.income.FifthLevelIncomeTax;
import au.com.myob.tax.income.FirstLevelIncomeTax;
import au.com.myob.tax.income.FourthLevelIncomeTax;
import au.com.myob.tax.income.SecondLevelIncomeTax;
import au.com.myob.tax.income.ThirdLevelIncomeTax;


public class TaxtableIncomeFactoryTest {
	

	@Test
	public void shouldReturnFirstLevelTaxWhenAnnualSalaryBetweenZeroAndEighteenThousandAndTwoHundred(){
		assertTrue(TaxtableIncomeFactory.getTaxtable(5000) instanceof FirstLevelIncomeTax);
	}
	
	@Test
	public void shouldReturnSecondLevelTaxWhenAnnualSalaryHigherThanEighteenThousandAndTwoHundredAndLowerOrEqualThanThirtySevenThousand(){
		assertTrue(TaxtableIncomeFactory.getTaxtable(18201) instanceof SecondLevelIncomeTax);
	}
	
	@Test
	public void shouldReturnThirdLevelTaxWhenAnnualSalaryHigherThanThirtySevenHundredAndLowerOrEqualEightHundred(){
		assertTrue(TaxtableIncomeFactory.getTaxtable(50492) instanceof ThirdLevelIncomeTax);
	}
	
	@Test
	public void shouldReturnFourthLevelTaxWhenAnnualSalaryHigherThanEightHundredAndLoweOneThousandAndEightHundred(){
		assertTrue(TaxtableIncomeFactory.getTaxtable(80492) instanceof FourthLevelIncomeTax);
	}
	
	@Test
	public void shouldReturnFifthLevelTaxWhenAnnualSalaryHigherThanOneThousandAndEightHundred(){
		assertTrue(TaxtableIncomeFactory.getTaxtable(180001) instanceof FifthLevelIncomeTax);
	}

}
