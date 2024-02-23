package com.motorph.employeeapp.deduction;

import java.text.DecimalFormat;

public class PhilHealth extends Deduction implements DeductionConstants {
    public PhilHealth(double monthlyBasicSalary, double monthlyGrossSalary) {
        super(monthlyBasicSalary, monthlyGrossSalary);
    }

    @Override
    public double calculateDeduction() {
        double result;

        if (getMonthlyBasicSalary() <= 10_000) result = 300 / PHILHEALTH.PREMIUM_RATE;

        else if (getMonthlyBasicSalary() > 10_000 && getMonthlyBasicSalary() < 60_000)
            result = (getMonthlyBasicSalary() * PHILHEALTH.PREMIUM_RATE) / PHILHEALTH.EMPLOYEE_SHARE;

        else result =  (double) 1_800 / PHILHEALTH.EMPLOYEE_SHARE;

        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        String roundedValue = decimalFormat.format(result);

        return Double.parseDouble(roundedValue);
    }
}