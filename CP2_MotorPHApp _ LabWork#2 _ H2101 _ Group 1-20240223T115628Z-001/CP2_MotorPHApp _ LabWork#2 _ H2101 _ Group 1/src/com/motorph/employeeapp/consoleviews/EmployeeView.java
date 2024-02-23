package com.motorph.employeeapp.consoleviews;

import com.motorph.employeeapp.EmployeeApp;
import com.motorph.employeeapp.consoleviews.printer.EmployeePrinter;
import com.motorph.employeeapp.exceptions.InvalidInput;
import com.motorph.employeeapp.models.records.Employees;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeView  {
    private Scanner scanner;

    private final int
        VIEW_EMPLOYEES = 0 ,
        FIND_EMPLOYEE = 1 ,
        EXIT = 2;

    public EmployeeView() {
        scanner = new Scanner(System.in);
    }

    public void displayEmployeeViewScreen() throws InterruptedException {
        boolean isRunning = true;
        do {
            int enteredNumber = 0;
            System.out.println("----------Employee View-----------");
            System.out.println("[0]\tView employees");
            System.out.println("[1]\tFind employee by employee number");
            System.out.println("[2]\tExit");
            System.out.print("Enter number: ");

            try {
                enteredNumber = scanner.nextInt();
                switch (enteredNumber) {
                    case VIEW_EMPLOYEES:
                        System.out.println("--------------Employees-----------");
                        EmployeePrinter.printHeaders();
                        for (int i = 0; i < Employees.RECORDS().size(); i++) {
                            EmployeePrinter.printEmployee(i);
                        }
                        break;
                    case FIND_EMPLOYEE:
                        do {
                            Scanner scannerEmployeeNumber = new Scanner(System.in);
                            System.out.println("----------Find Employee-----------");
                            System.out.println("Enter -1 to exit");
                            System.out.print("Enter employee #: "); // employee ID

                            try {
                                int enter_employee_number = scannerEmployeeNumber.nextInt();

                                if (enter_employee_number == -1) break;

                                else {
                                    boolean isFound = EmployeeApp.isEmployeeNumberExist(String.valueOf(enter_employee_number));

                                    if (isFound) {
                                        EmployeePrinter.printHeaders();
                                        for (int i = 0; i < Employees.RECORDS().size(); i++) {
                                            if (Employees.RECORDS().get(i).getId().equals(String.valueOf(enter_employee_number)))
                                                EmployeePrinter.printEmployee(i);
                                        }
                                    }
                                    else {
                                        System.err.println("Employee not found.");
                                    }
                                }
                            }
                            catch (InputMismatchException inputMismatchException) {
                                InvalidInput invalidInputOuter = new InvalidInput("Invalid employee number.");
                                System.out.println(invalidInputOuter.getMessage());
                                System.out.println("Please try again.\n\n\n");
                            }
                        }
                        while (true);
                        break;
                    case EXIT:
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < 3; i++) {
                            sb.append(".");
                            System.out.println("Loading" + sb);
                            Thread.sleep(1000);
                        }
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Invalid input.");
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume invalid input
            }
        } while (isRunning);
        System.out.println("\n\n\n");
    }
}
