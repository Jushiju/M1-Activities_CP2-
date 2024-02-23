package com.motorph.employeeapp.consoleviews;

import com.motorph.employeeapp.EmployeeApp;
import com.motorph.employeeapp.consoleviews.printer.AttendancePrinter;
import com.motorph.employeeapp.exceptions.InvalidInput;

import java.util.Scanner;

public class AttendanceRecordView {

    private Scanner scanner;

    private final int
            VIEW_ALL_ATTENDANCES = 0 ,
            VIEW_ATTENDANCE_BY_EMPLOYEE_NUMBER = 1 ,
            EXIT = 2;

    public AttendanceRecordView() {
        scanner = new Scanner(System.in);
    }

    public void displayAttendanceRecordScreen() {
        boolean isDisplayAttendanceRecordScreen = true;
        do {
            System.out.println("\n\n\n");
            System.out.println("----------Attendance View-----------");
            System.out.println("[0]\tView all attendances");
            System.out.println("[1]\tView attendance by employee number");
            System.out.println("[2]\tExit");
            System.out.print("Enter action number: ");
            try {
                int enter_action_number = scanner.nextInt();
                switch (enter_action_number) {
                    case VIEW_ALL_ATTENDANCES: {
                        System.out.println("--------------Attendances-----------");
                        AttendancePrinter.printAllAttendance();
                        break;
                    }
                    case VIEW_ATTENDANCE_BY_EMPLOYEE_NUMBER: {
                        boolean isVIEW_ATTENDANCE_BY_EMPLOYEE_NUMBER = true;
                        do {
                            System.out.println("--------Employee Attendances--------");
                            System.out.println("Enter -1 to exit");
                            System.out.print("Enter employee number to find attendances: ");
                            scanner = new Scanner(System.in);
                            try {
                                int enter_employee_number = scanner.nextInt();
                                switch (enter_employee_number) {
                                    case -1: {
                                        isVIEW_ATTENDANCE_BY_EMPLOYEE_NUMBER = false;
                                        break;
                                    }
                                    default: {
                                        boolean isEmployeeExist = EmployeeApp.isEmployeeNumberExist(String.valueOf(enter_employee_number));
                                        if (isEmployeeExist) {
                                            AttendancePrinter.printEmployeeNumberAttendances(enter_employee_number);
                                        }
                                        else {
                                            System.err.println("Employee number not found.");
                                        }
                                        break;
                                    }
                                }
                            }
                            catch (Exception e) {
                                InvalidInput invalidInput = new InvalidInput("Invalid input");
                                System.out.println(invalidInput.getMessage());
                            }
                        }
                        while (isVIEW_ATTENDANCE_BY_EMPLOYEE_NUMBER);
                        break;
                    }
                    case EXIT: {
                        isDisplayAttendanceRecordScreen = false;
                        break;
                    }
                    default: {
                        System.err.println("Action not found.");
                        break;
                    }
                }
            }
            catch (Exception e) {
                InvalidInput invalidInput = new InvalidInput("Invalid input.");
                System.out.println(invalidInput.getMessage());
                scanner.nextLine();
            }
        } while (isDisplayAttendanceRecordScreen);
        System.out.println("\n\n\n");
    }
}
