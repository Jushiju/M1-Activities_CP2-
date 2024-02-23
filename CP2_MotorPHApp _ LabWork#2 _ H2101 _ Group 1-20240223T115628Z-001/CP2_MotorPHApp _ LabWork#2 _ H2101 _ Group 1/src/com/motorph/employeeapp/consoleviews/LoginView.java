package com.motorph.employeeapp.consoleviews;

import com.motorph.employeeapp.io.attendance.AttendanceCsvReader;
import com.motorph.employeeapp.io.employee.EmployeeCsvReader;
import com.motorph.employeeapp.services.AuthService;

import java.util.Scanner;

public class LoginView {
    private final Scanner scanner;
    private final AuthService authService;

    public LoginView() {
        scanner = new Scanner(System.in);
        authService = new AuthService();
    }

    public void displayLoginScreen() throws InterruptedException {
        int loginAttempt = 5;
        do {
            System.out.println("MOTORPH Login Console");
            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            delay3s();

            if ((authService.verifyLogin(username, password))) {
                System.out.println("Login successful!\n\n\n");
                EmployeeCsvReader.addAllEmployee();
                AttendanceCsvReader.addAttendances();
                HomeView homeView = new HomeView();
                homeView.displayHomeScreen();
                break;
            } else {
                System.out.println("Invalid credentials\n\n\n");
            }
            loginAttempt--;
        }
        while (loginAttempt > 0);
        String message = (loginAttempt == 0)
                ? "Access denied due to incorrect credentials."
                : """
                Office Hours: 8:30am–5:30pm, Monday through Saturday\s
                Office Address: 7 Jupiter Avenue cor. F. Sandoval Jr., Bagong Nayon, Quezon City\s
                Phone: (028) 911-5071 / (028) 911-5072 / (028) 911-5073\s
                Email: corporate@motorph.com""";
        System.out.println(message);
    }

    private void delay3s() throws InterruptedException {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            stringBuilder.append(".");
            Thread.sleep(1000);
            System.out.println("Verifying"+stringBuilder);
        };
    }
}
