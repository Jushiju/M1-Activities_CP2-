package com.motorph.employeeapp;

import com.motorph.employeeapp.consoleviews.LoginView;
import com.motorph.employeeapp.models.records.Employees;

public class EmployeeApp {
    public static boolean isEmployeeNumberExist(String eid) {
        for (int i = 0; i < Employees.RECORDS().size(); i++) {
            if (Employees.RECORDS().get(i).getId().equals(eid)) // employee found
                return true;
        }
        return false; // employee not found
    }
    public static final String EMPLOYEE_CREDENTIALS_CSV =
            "F:\\MO-IT101-Group4\\csv_files\\MotorPH Employee Data - Credentials.csv";
    public static final String EMPLOYEE_DETAILS_CSV =
            "F:\\MO-IT101-Group4\\csv_files\\MotorPH Employee Data - Employee Details.csv";
    public static final String ATTENDANCE_CSV =
            "F:\\MO-IT101-Group4\\csv_files\\MotorPH Employee Data - Attendance Record.csv";
    public static final String LEAVE_CSV =
            "F:\\MO-IT101-Group4\\csv_files\\MotorPH Employee Data - Leaves.csv";


    public static void main(String[] args) throws InterruptedException {
        LoginView loginView = new LoginView();
        loginView.displayLoginScreen();
    }
}
