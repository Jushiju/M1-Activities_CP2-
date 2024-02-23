package com.motorph.employeeapp.enums;

public enum EmployeeStatus {
    REGULAR("Regular"),
    PROBATIONARY("Probationary");

    private final String displayName;

    EmployeeStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
