package com.motorph.employeeapp.enums;

public enum Time {
    TIME_IN("09:00 AM"),
    TIME_OUT("06:00 PM");

    private final String displayTime;

    Time(String displayTime) {
        this.displayTime = displayTime;
    }

    public String getDisplayTime() {
        return displayTime;
    }
}
