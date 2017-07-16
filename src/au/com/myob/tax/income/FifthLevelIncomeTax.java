package au.com.myob.tax.income;

import au.com.myob.service.IncomeTax;

public class FifthLevelIncomeTax extends IncomeTax {

	@Override
	protected double getTax() {
		return 0.45;
	}

	@Override
	protected double getPenalty() {
		return 54547;
	}

	@Override
	protected double getBaseFare() {
		// TODO Auto-generated method stub
		return 0;
	}

}
