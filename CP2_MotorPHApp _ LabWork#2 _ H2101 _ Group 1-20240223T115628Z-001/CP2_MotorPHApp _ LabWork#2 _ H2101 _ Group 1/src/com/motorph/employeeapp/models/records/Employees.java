package com.motorph.employeeapp.models.records;


import com.motorph.employeeapp.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private static List<Employee> records = new ArrayList<>();

    public static void addEmployee(Employee employee) {
        records.add(employee);
    }

    public static void deleteAllEmployees() {
        records.clear();
    }

    public static List<Employee> RECORDS() {
        return records;
    }
}
