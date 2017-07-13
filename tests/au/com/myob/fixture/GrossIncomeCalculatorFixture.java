package au.com.myob.fixture;

import au.com.myob.service.GrossIncomeCalculator;

public class GrossIncomeCalculatorFixture {
	
	private GrossIncomeCalculator fixture = new GrossIncomeCalculator();  

	public static GrossIncomeCalculatorFixture get() {
		return new GrossIncomeCalculatorFixture();
	}

	public GrossIncomeCalculatorFixture withIncomeByAnnualSalary(double annualSalary) {
		fixture.calculate(annualSalary);
		return this;
	}

	public GrossIncomeCalculator build() {
		return this.fixture;
	}

}
