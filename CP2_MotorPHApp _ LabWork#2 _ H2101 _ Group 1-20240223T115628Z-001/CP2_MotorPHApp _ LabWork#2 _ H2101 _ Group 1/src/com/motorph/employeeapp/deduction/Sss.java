package com.motorph.employeeapp.deduction;

public class Sss extends Deduction implements DeductionConstants {
    public Sss(double monthlyBasicSalary, double monthlyGrossSalary) {
        super(monthlyBasicSalary, monthlyGrossSalary);
    }

    @Override
    public double calculateDeduction() {
        if (getMonthlyGrossSalary() < 3_250)
            return 135.00f;

        else if (getMonthlyGrossSalary() >= 24_750)
            return 1_125.00f;

        else {
            int minimum_salary_limit = SSS.MINIMUM_SALARY_RANGE,
                maximum_salary_limit = SSS.MAXIMUM_SALARY_RANGE;

            float contribution = SSS.MINIMUM_CONTRIBUTION;

            while (contribution < SSS.MAXIMUM_CONTRIBUTION) {
                if (getMonthlyGrossSalary() >= minimum_salary_limit && getMonthlyGrossSalary() < maximum_salary_limit)
                    return contribution;
                else {
                    minimum_salary_limit += 500;
                    maximum_salary_limit += 500;
                    contribution += 22.50f;
                }
            }
        }
        return 0.00d;
    }
}