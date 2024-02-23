package com.motorph.employeeapp.models.records;


import com.motorph.employeeapp.models.Attendance;

import java.util.ArrayList;
import java.util.List;

public class Attendances {

    private static List<Attendance> RECORDS = new ArrayList<>();

    public static void addAttendance(Attendance attendance) {
        RECORDS.add(attendance);
    }

    public static void deleteAllAttendance() {
        RECORDS.clear();
    }

    public static List<Attendance> RECORDS() {
        return RECORDS;
    }

    public static List<Attendance> getRECORDS() {
        return RECORDS;
    }
}
