package au.com.myob.service;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.mockito.BDDMockito.*;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import au.com.myob.tax.income.ThirdLevelIncomeTax;

public class NetIncomeCalculatorTest {
	
	private NetIncomeCalculator income;
	@Mock
	private GrossIncomeCalculator grossIncome;
	@Mock
	private ThirdLevelIncomeTax incomeTax;
	
	@Before
	public void setup(){
		initMocks(this);
		income = new NetIncomeCalculator(grossIncome, incomeTax);
	}
	
	@Test
	public void shouldSubtractFromGrossIncomeAndIncomeTaxWhenCalculate(){
		income.calculate();
		verify(grossIncome).getIncome();
		verify(incomeTax).getIncomeTax();
	}

}
