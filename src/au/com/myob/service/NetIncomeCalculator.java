package au.com.myob.service;

public class NetIncomeCalculator {
	
	private GrossIncomeCalculator grossIncome;
	private IncomeTax incomeTax;
	private int income;
	
	public NetIncomeCalculator(GrossIncomeCalculator grossIncome, IncomeTax incomeTax) {
		this.grossIncome = grossIncome;
		this.incomeTax = incomeTax;
	}
	
	public double calculate(){
		return this.income = grossIncome.getIncome() - incomeTax.getIncomeTax();
	}
	
	public int getIncome(){
		return this.income;
	}
	
	

}
