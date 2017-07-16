package au.com.myob.tax.income;

import au.com.myob.service.IncomeTax;

public class SecondLevelIncomeTax extends IncomeTax {

	@Override
	public double getTax() {
		return 0.19;
	}

	@Override
	protected double getPenalty() {
		return 0;
	}

	@Override
	protected double getBaseFare() {
		return 18200;
	}

}
