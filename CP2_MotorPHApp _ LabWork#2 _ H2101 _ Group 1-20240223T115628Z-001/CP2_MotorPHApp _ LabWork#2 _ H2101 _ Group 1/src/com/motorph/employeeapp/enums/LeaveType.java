package com.motorph.employeeapp.enums;

public enum LeaveType {
    EMERGENCY("Emergency"),
    SICK("Sick"),
    VACATION("Vacation");

    private final String displayName;

    LeaveType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
