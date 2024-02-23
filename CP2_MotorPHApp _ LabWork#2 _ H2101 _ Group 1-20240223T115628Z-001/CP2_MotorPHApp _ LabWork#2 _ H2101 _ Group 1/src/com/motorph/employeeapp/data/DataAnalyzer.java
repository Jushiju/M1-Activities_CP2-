package com.motorph.employeeapp.data;

import com.motorph.employeeapp.models.Employee;
import com.motorph.employeeapp.models.records.Employees;

public class DataAnalyzer {
    public double calculateAverageBasicSalary() {

        if (Employees.RECORDS().isEmpty()) {
            return 0.0d;
        }

        double totalSalary = 0.0;
        for (Employee employee : Employees.RECORDS()) {
            totalSalary += employee.getBasic_salary();
        }

        return totalSalary / Employees.RECORDS().size();
    }
}
