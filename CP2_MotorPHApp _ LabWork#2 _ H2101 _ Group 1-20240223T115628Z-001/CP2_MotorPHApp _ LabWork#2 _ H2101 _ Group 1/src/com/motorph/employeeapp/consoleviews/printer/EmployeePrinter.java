package com.motorph.employeeapp.consoleviews.printer;

import com.motorph.employeeapp.models.records.Employees;

public class EmployeePrinter {
    public static void printEmployee(int index) {
        System.out.println(
            String.format("%-15s", Employees.RECORDS().get(index).getId()) +
            String.format("%-15s", Employees.RECORDS().get(index).getL_name()) +
            String.format("%-15s", Employees.RECORDS().get(index).getF_name()) +
            String.format("%-30s", Employees.RECORDS().get(index).getBirthday()));
    }

    public static void printHeaders() {
        String[] header = new String[4];
        header[0] = String.format("%-15s", "Employee #");
        header[1] = String.format("%-15s", "Last Name");
        header[2] = String.format("%-15s", "First");
        header[3] = String.format("%-15s", "Birthday");
        System.out.println(header[0] + header[1] + header[2]);
    }

    public static void printDashesLine() {
        for (int i = 0; i < 75; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
