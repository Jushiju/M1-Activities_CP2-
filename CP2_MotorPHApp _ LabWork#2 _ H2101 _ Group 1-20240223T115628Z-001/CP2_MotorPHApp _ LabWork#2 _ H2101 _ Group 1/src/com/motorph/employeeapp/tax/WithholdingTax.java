package com.motorph.employeeapp.tax;

import com.motorph.employeeapp.deduction.Deduction;
import com.motorph.employeeapp.deduction.Pagibig;
import com.motorph.employeeapp.deduction.PhilHealth;
import com.motorph.employeeapp.deduction.Sss;

import java.text.DecimalFormat;

public class WithholdingTax  extends Deduction implements WithHoldingTaxConstants{
    private final double taxable_income;


    public WithholdingTax (double monthlyBasicSalary, double monthlyGrossSalary) {
        super(monthlyBasicSalary, monthlyGrossSalary);
        this.taxable_income = getMonthlyGrossSalary() - calculateTotalDeduction();
    }

    @Override
    public double calculateDeduction() {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        return Double.parseDouble(decimalFormat.format(calculateWitholdingTax()));
    }

    public double calculateTotalDeduction() {
        Sss sss = new Sss(getMonthlyBasicSalary(),getMonthlyGrossSalary());
        PhilHealth philHealth = new PhilHealth(getMonthlyBasicSalary(),getMonthlyGrossSalary());
        Pagibig pagibig = new Pagibig(getMonthlyBasicSalary(),getMonthlyGrossSalary());
        System.out.println("SSS        = "+sss.calculateDeduction());
        System.out.println("PHILHEALTH = " + philHealth.calculateDeduction());
        System.out.println("PAGIBIG    = "+pagibig.calculateDeduction());
        return (sss.calculateDeduction() + philHealth.calculateDeduction() + pagibig.calculateDeduction());
    }

    public double calculateWitholdingTax() {
        if (taxable_income <= MONTHLY_RATE_EXCESS_PRIMARY)
            return ZERO_WITHHOLDING_TAX;
        else if (taxable_income < MONTHLY_RATE_EXCESS_SECONDARY)
            return (taxable_income - MONTHLY_RATE_EXCESS_PRIMARY) * TAX_RATE_1;
        else if (taxable_income < MONTHLY_RATE_EXCESS_TERTIARY)
            return ((taxable_income - MONTHLY_RATE_EXCESS_SECONDARY) * TAX_RATE_2) + ADDITIONAL_TAX_AMOUNT_PRIMARY;
        else if (taxable_income < MONTHLY_RATE_EXCESS_QUATERNARY)
            return ((taxable_income - MONTHLY_RATE_EXCESS_TERTIARY) * TAX_RATE_3) + ADDITIONAL_TAX_AMOUNT_SECONDARY;
        else if (taxable_income < MONTHLY_RATE_EXCESS_QUINARY)
            return ((taxable_income - MONTHLY_RATE_EXCESS_QUATERNARY) * TAX_RATE_4) + ADDITIONAL_TAX_AMOUNT_TERTIARY;
        else
            return ((taxable_income - MONTHLY_RATE_EXCESS_QUINARY) * TAX_RATE_5) + ADDITIONAL_TAX_AMOUNT_QUATERNARY;
    }
}
