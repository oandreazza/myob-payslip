package au.com.myob.service;

public class SuperCalculator {
	
	private double rate;
	private GrossIncomeCalculator grossIncome;
	private int value;

	public SuperCalculator(double rate, GrossIncomeCalculator grossIncome) {
		this.rate = rate;
		this.grossIncome = grossIncome;
	}

	public int calculate() {
		return this.value = (int) Math.round(grossIncome.getIncome() * (this.rate/100));
	}
	
	public int getValue() {
		return this.value;
	}
	

}
