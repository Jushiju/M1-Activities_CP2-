package com.motorph.employeeapp.calculator;

import java.time.Duration;

public class HoursWorkedCalculator {
    public static int computeDifference(Duration timeIn, Duration timeOut) {
        Duration difference = timeOut.minus(timeIn);
        return (int) difference.toHours();
    }
}
