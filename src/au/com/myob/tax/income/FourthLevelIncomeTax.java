package au.com.myob.tax.income;

import au.com.myob.interfaces.IncomeTax;

public class FourthLevelIncomeTax extends IncomeTax {

	@Override
	public double getTax() {
		return 0.37;
	}

	@Override
	protected double getPenalty() {
		return 17547;
	}

	@Override
	protected double getBaseFare() {
		return 80000;
	}

}
