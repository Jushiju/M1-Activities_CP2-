package com.motorph.employeeapp.models.records;


import com.motorph.employeeapp.models.Leave;

import java.util.ArrayList;
import java.util.List;

public class LeaveRecords {
    private static List<Leave> records = new ArrayList<>();

    public static void addLeave(Leave leave) {
        records.add(leave);
    }

    public static void deleteAllLeave() {
        records.clear();
    }

    public static List<Leave> getAllLeave() {
        return records;
    }
}
