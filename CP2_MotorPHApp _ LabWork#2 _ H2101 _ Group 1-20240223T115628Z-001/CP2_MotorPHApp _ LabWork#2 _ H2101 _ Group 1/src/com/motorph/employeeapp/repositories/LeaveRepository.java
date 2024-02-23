package com.motorph.employeeapp.repositories;


import com.motorph.employeeapp.models.Leave;

import java.util.ArrayList;
import java.util.List;

public class LeaveRepository {
    private List<Leave> leaveRecords;

    public LeaveRepository() {
        this.leaveRecords = new ArrayList<>();
    }

    public void saveLeave(Leave leave) {
        leaveRecords.add(leave);
        // Additional logic to save leave record to a data source (e.g., CSV)
    }

    public List<Leave> getAllLeaves() {
        return leaveRecords;
        // Additional logic to retrieve all leave records from the data source
    }

    public List<Leave> getLeavesByEmployeeId(String employeeId) {
        List<Leave> filteredLeaves = new ArrayList<>();
        for (Leave leave : leaveRecords) {
            if (leave.getEmployeeId().equals(employeeId)) {
                filteredLeaves.add(leave);
            }
        }
        return filteredLeaves;
        // Additional logic to retrieve leave records by employee ID from the data source
    }
}
