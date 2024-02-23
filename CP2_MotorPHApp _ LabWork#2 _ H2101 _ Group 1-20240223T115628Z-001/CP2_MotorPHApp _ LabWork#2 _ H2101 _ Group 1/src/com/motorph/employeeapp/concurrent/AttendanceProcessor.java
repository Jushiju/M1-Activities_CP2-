package com.motorph.employeeapp.concurrent;


import com.motorph.employeeapp.models.Attendance;
import com.motorph.employeeapp.repositories.AttendanceRepository;

import java.util.List;

public class AttendanceProcessor implements Runnable {
    private List<Attendance> attendanceList;
    private AttendanceRepository attendanceRepository;

    public AttendanceProcessor(List<Attendance> attendanceList, AttendanceRepository attendanceRepository) {
        this.attendanceList = attendanceList;
        this.attendanceRepository = attendanceRepository;
    }

    @Override
    public void run() {
        // Perform multi-threaded processing on attendance records
        for (Attendance attendance : attendanceList) {
            // Process each attendance record concurrently
            // ...
            attendanceRepository.saveAttendance(attendance); // Example: Saving attendance to repository
            // ...
        }
    }
}

