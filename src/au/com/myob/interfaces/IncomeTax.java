package au.com.myob.interfaces;

public abstract class IncomeTax {
	
	protected int incomeTax;
	
	protected abstract double getTax();
	
	protected abstract double getPenalty();
	
	protected abstract double getBaseFare();
	
	public int calculateTax(double annualSalary){
		return this.incomeTax = (int) Math.round((getPenalty() + (annualSalary - getBaseFare()) * getTax() ) / 12);
	}

	public int getIncomeTax() {
		return this.incomeTax;
	}
	
}
