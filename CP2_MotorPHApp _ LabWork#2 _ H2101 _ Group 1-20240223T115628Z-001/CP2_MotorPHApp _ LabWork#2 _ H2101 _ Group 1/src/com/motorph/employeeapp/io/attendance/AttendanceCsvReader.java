package com.motorph.employeeapp.io.attendance;

import com.motorph.employeeapp.EmployeeApp;
import com.motorph.employeeapp.converter.DurationConverter;
import com.motorph.employeeapp.models.Attendance;
import com.motorph.employeeapp.models.records.Attendances;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AttendanceCsvReader {

    public static void addAttendances() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(EmployeeApp.ATTENDANCE_CSV));
            String row;
            boolean is_header = true;
            while ((row = br.readLine()) != null) {

                if (is_header) is_header = false;
                else {
                    String [] col = row.split(",");
                    Attendance attendance = new Attendance(
                        Integer.parseInt(col[0]),
                        col[1],
                        col[2],
                        col[3],
                        DurationConverter.parseDurationString(col[4]),
                        DurationConverter.parseDurationString(col[5]));
                    Attendances.addAttendance(attendance);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
