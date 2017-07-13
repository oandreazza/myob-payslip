package au.com.myob.tax.income;

import au.com.myob.interfaces.IncomeTax;

public class ThirdLevelIncomeTax extends IncomeTax{

	@Override
	public double getTax() {
		return 0.325;
	}

	@Override
	protected double getPenalty() {
		return 3572;
	}

	@Override
	protected double getBaseFare() {
		return 37000;
	}

}
