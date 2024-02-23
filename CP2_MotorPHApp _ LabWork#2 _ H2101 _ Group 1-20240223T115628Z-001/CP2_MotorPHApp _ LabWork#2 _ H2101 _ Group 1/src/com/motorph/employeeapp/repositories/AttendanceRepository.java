package com.motorph.employeeapp.repositories;


import com.motorph.employeeapp.models.Attendance;

import java.util.ArrayList;
import java.util.List;

public class AttendanceRepository {
    private List<Attendance> attendanceRecords;

    public AttendanceRepository() {
        this.attendanceRecords = new ArrayList<>();
    }

    public void saveAttendance(Attendance attendance) {
        attendanceRecords.add(attendance);
        // Additional logic to save attendance record to a data source (e.g., CSV)
    }

    public List<Attendance> getAllAttendances() {
        return attendanceRecords;
        // Additional logic to retrieve all attendance records from the data source
    }

    public List<Attendance> getAttendancesByEmployeeId(String employeeId) {
        List<Attendance> filteredAttendances = new ArrayList<>();
        for (Attendance attendance : attendanceRecords) {
            if (attendance.getEmployeeId().equals(employeeId)) {
                filteredAttendances.add(attendance);
            }
        }
        return filteredAttendances;
        // Additional logic to retrieve attendance records by employee ID from the data source
    }
}
