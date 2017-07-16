package au.com.myob.tax.income;

import au.com.myob.service.IncomeTax;

public class FirstLevelIncomeTax extends IncomeTax {

	@Override
	public double getTax() {
		return 0;
	}
	
	@Override
	public int calculateTax(double annualSalary) {
		return 0;
	}

	@Override
	protected double getPenalty() {
		return 0;
	}

	@Override
	protected double getBaseFare() {
		return 180000;
	}

}
