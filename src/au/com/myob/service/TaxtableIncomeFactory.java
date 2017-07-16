package au.com.myob.service;

import au.com.myob.tax.income.FifthLevelIncomeTax;
import au.com.myob.tax.income.FirstLevelIncomeTax;
import au.com.myob.tax.income.FourthLevelIncomeTax;
import au.com.myob.tax.income.SecondLevelIncomeTax;
import au.com.myob.tax.income.ThirdLevelIncomeTax;

public class TaxtableIncomeFactory {

	public static IncomeTax getTaxtable(double annualSalary) {

		if(annualSalary > 18200 && annualSalary <= 37000)
			return new SecondLevelIncomeTax();
		
		if(annualSalary > 37000 && annualSalary <= 80000)
			return new ThirdLevelIncomeTax();
		
		if(annualSalary > 80000 && annualSalary <= 180000)
			return new FourthLevelIncomeTax();
		
		if(annualSalary > 180000)
			return new FifthLevelIncomeTax();
		
					
		return new FirstLevelIncomeTax();
	}



}
