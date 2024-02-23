package com.motorph.employeeapp.consoleviews;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeView {


    public void displayHomeScreen() throws InterruptedException {
        boolean isHomeScreenRunning = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("---MOTORPH PAYROLL SYSTEM---");
            System.out.println("[0]\tAbout MotorPH");
            System.out.println("[1]\tEmployees");
            System.out.println("[2]\tAttendances");
            System.out.println("[3]\tLeaves");
            System.out.println("[4]\tSalary Calculator");
            System.out.println("[5]\tData Source");
            System.out.println("[6]\tQuit");
            System.out.print("Enter number:\t");

            int choosen_number = 0;

            try {
                choosen_number = (scanner.nextInt());
            }
            catch (InputMismatchException ignored) {
                System.out.println("Invalid input.\n\n\n");
                continue;
            }



            switch (choosen_number) {
                case 0 -> {
                    System.out.println("About MotorPH");
                    AboutView aboutView = new AboutView();
                    aboutView.displayAboutView();
                }
                case 1 -> {
                    System.out.println("Employees Details");
                    EmployeeView employeeView = new EmployeeView();
                    employeeView.displayEmployeeViewScreen();
                }
                case 2 -> {
                    System.out.println("Attendance Records");
                    AttendanceRecordView attendanceRecordView = new AttendanceRecordView();
                    attendanceRecordView.displayAttendanceRecordScreen();
                }
                case 3 -> {
                    System.out.println("Employee Payslip");
                }
                case 4 -> {
                    System.out.println("Leave Management");
                    System.out.println("Employee Request");
                    System.out.println("Approval Workflow");
                    System.out.println("Leave Balances");
                    System.out.println("Calendar Integration");
                    System.out.println("Reporting and Analytics");
                    System.out.println("Leave Policies");
                    System.out.println("Self-Service Features");
                }
                case 5 -> {
                    System.out.println("CSV Data Source");
                    System.out.println("Employee Details Maintenance");
                    System.out.println("Attendance Record Maintenance");
                }
                case 6 -> {
                    isHomeScreenRunning = false;
                }
                default -> {
                    System.out.println("Invalid input.\n\n\n");
                }
            }
        }
        while (isHomeScreenRunning);
        System.out.println("\n\n\n");
    }
}
