package com.motorph.employeeapp.enums;

public enum EmployeePosition {

    HR_MANAGER("Hr Manager"),
    HR_TEAM_LEAD("HR Team Leader"),
    HR_RANK_AND_FILE("HR Rank and File"),
    ACCOUNT_MANAGER("Account Manager"),
    ACCOUNT_TEAM_LEADER("Account Team Leader"),
    ACCOUNT_RANK_AND_FILE("Account Rank and File"),
    PAYROLL_MANAGER("Payroll Manager"),
    PAYROLL_TEAM_LEADER("Payroll Team Leader"),
    PAYROLL_RANK_AND_FILE("Payroll Rank and File");

    private final String displayName;

    EmployeePosition(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
