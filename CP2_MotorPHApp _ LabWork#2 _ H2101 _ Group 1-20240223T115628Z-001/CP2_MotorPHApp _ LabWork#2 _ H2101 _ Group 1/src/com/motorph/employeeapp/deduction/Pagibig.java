package com.motorph.employeeapp.deduction;

public class Pagibig extends Deduction implements DeductionConstants {
    public Pagibig(double monthlyBasicSalary, double monthlyGrossSalary) {
        super(monthlyBasicSalary, monthlyGrossSalary);
    }

    @Override
    public double calculateDeduction() {
        double contribution = getMonthlyBasicSalary() >= 1_500
                ? getMonthlyBasicSalary() * PAGIBIG.EMPLOYERS_CONTRIBUTION_RATE
                : (getMonthlyBasicSalary() >= 1_000 && getMonthlyBasicSalary() <= 1_500)
                    ? getMonthlyBasicSalary() * 0.01f
                    : 0.00f;
        return (contribution >= 100) ? PAGIBIG.MAXIMUM_CONTRIBUTION : contribution;
    }
}