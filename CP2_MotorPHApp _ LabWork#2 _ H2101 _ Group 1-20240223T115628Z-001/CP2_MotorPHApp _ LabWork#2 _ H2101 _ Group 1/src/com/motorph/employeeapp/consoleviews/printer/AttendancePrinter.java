package com.motorph.employeeapp.consoleviews.printer;

import com.motorph.employeeapp.converter.DurationConverter;
import com.motorph.employeeapp.models.records.Attendances;

public class AttendancePrinter {
    public static void printAttendance(int index) {
        System.out.println(
            String.format("%-10s", Attendances.RECORDS().get(index).getEmployeeId()) +
            String.format("%-15s", Attendances.RECORDS().get(index).getL_name()) +
            String.format("%-15s", Attendances.RECORDS().get(index).getF_name()) +
            String.format("%-15s", Attendances.RECORDS().get(index).getDate()) +
            String.format("%-10s", DurationConverter.formatDuration((Attendances.RECORDS().get(index).getTimeIn()))) +
            String.format("%-10s", DurationConverter.formatDuration(Attendances.RECORDS().get(index).getTimeOut())));
    }

    public static void printAllAttendance() {
        for (int i = 0; i < Attendances.RECORDS().size(); i++) {
            AttendancePrinter.printAttendance(i);
        }
    }

    public static void printEmployeeNumberAttendances(int employeeNumber) {
        for (int i = 0; i < Attendances.RECORDS().size(); i++) {
            if (employeeNumber == (Attendances.getRECORDS().get(i).getEmployee_number())) {
                AttendancePrinter.printAttendance(i);
            }
        }
    }

    public static void printHeaders() {
        // Employee #,Last Name,First Name,Date,Time-in,Time-out
        String[] header = new String[3];
        header[0] = String.format("%-10s", "Employee #");
        header[1] = String.format("%-15s", "Last Name");
        header[2] = String.format("%-15s", "First Name");
        header[3] = String.format("%-10s", "Date");
        header[4] = String.format("%-10s", "Time-in");
        header[5] = String.format("%-10s", "Time-out");
        System.out.println(header[0] + header[1] + header[2]);
    }

    public static void printDashesLine() {
        for (int i = 0; i < 75; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
