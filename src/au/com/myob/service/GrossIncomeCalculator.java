package au.com.myob.service;

public class GrossIncomeCalculator {

	private int income;

	public int calculate(double annualSalary) {
		return this.income = (int) Math.round(annualSalary/12);
	}

	public int getIncome() {
		return this.income;
	}
}
