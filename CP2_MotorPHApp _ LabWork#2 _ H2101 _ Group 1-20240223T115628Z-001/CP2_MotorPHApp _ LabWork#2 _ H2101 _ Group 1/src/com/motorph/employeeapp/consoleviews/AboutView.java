package com.motorph.employeeapp.consoleviews;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutView {

    public Scanner scanner;

    public AboutView() {
        scanner = new Scanner(System.in);
    }

    public void displayAboutView() {
        boolean isAboutView = true;
        int enter_number;

        do {
            System.out.println("----------MOTORPH-----------");
            System.out.println("---THE FILIPINO'S CHOICE!---");
            System.out.println("[0]\tWho are we");
            System.out.println("[1]\tWhat we offer");
            System.out.println("[2]\tOur goal");
            System.out.println("[3]\tExit");
            System.out.print("Enter number: ");
            try {
                enter_number = scanner.nextInt();

                switch (enter_number) {
                    case 0: {
                        System.out.println("""

                                ---WHO ARE WE?---
                                MotorPH was established in 2020 to provide private transportation options to Filipinos. Our goal is to be the first choice for Filipinos searching for competitive and affordable motorcycles.""");
                        break;
                    }
                    case 1: {
                        System.out.println("""

                                ---WHAT WE OFFER---
                                We offer motorcycles from different brands (Honda, Yamaha, Suzuki, and Kawasaki) at a discounted cash rate and flexible installment terms (from 3 months to 3 years).""");
                        break;
                    }
                    case 2: {
                        System.out.println("""

                                ---OUR GOAL---
                                From a purely online presence, MotorPH is planning to open physical stores. In the next 18 months, we're planning to open branches in different parts of the Philippines.\s""");
                        break;
                    }
                    case 3: {
                        isAboutView = false;
                        break;
                    }
                    default: {
                        System.out.println("Invalid input.");
                    }
                }

            }
            catch (InputMismatchException inputMismatchException) {
                System.out.println("Invalid input.");
                scanner = new Scanner(System.in);
            }
        }
        while (isAboutView);
        System.out.println("\n\n\n");
    }

    public static void main(String[] args) {
        AboutView aboutView = new AboutView();
        aboutView.displayAboutView();
    }
}
