package com.motorph.employeeapp.deduction;

public abstract class Deduction {
    private final double monthlyBasicSalary;
    private final double monthlyGrossSalary;

    public Deduction(double monthlyBasicSalary, double monthlyGrossSalary) {
        this.monthlyBasicSalary = monthlyBasicSalary;
        this.monthlyGrossSalary = monthlyGrossSalary;
    }

    public abstract double calculateDeduction();

    public double getMonthlyBasicSalary() {
        return monthlyBasicSalary;
    }

    public double getMonthlyGrossSalary() {
        return monthlyGrossSalary;
    }
}