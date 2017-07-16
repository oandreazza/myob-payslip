package au.com.myob.service;

import java.util.Scanner;

public class PayslipCalculator {
	
	public void calculate(double annualSalary, double superRate){
		
		GrossIncomeCalculator grossIncomeCalculator = new GrossIncomeCalculator();
		grossIncomeCalculator.calculate(annualSalary);
		
		IncomeTax incomeTax = TaxtableIncomeFactory.getTaxtable(annualSalary);
		incomeTax.calculateTax(annualSalary);
		
		NetIncomeCalculator netIncomeCalculator = new NetIncomeCalculator(grossIncomeCalculator, incomeTax);
		netIncomeCalculator.calculate();
		
		SuperCalculator superCalculator = new SuperCalculator(superRate, grossIncomeCalculator);
		superCalculator.calculate();
		
		System.out.println("Gross Income: " + grossIncomeCalculator.getIncome());
		System.out.println("Income tax: " + incomeTax.getIncomeTax());
		System.out.println("Net Income: " + netIncomeCalculator.getIncome());
		System.out.println("Super: "+ superCalculator.getValue());

	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter your Annual Salaray: e.g(5000.20) ");
		double salary = scanner.nextDouble();
		
		System.out.println("Enter your Super: e.g(99.50) ");
		double superRate = scanner.nextDouble();
		
		System.out.println();
		System.out.println("##################-----##################");
		System.out.println();
		
		System.out.println("Hello " + name + ", this is your Payslip:");
		
		new PayslipCalculator().calculate(salary, superRate);
	}

}

