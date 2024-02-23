package com.motorph.employeeapp.models;

import java.time.Duration;

public class Attendance {
    private int employee_number;
    private String l_name;
    private String f_name;
    private String date;
    private Duration timeIn;
    private Duration timeOut;

    public Attendance(int employee_number, String l_name, String f_name, String date, Duration timeIn, Duration timeOut) {
        this.employee_number = employee_number;
        this.l_name = l_name;
        this.f_name = f_name;
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    public int getEmployee_number() {
        return employee_number;
    }

    public void setEmployee_number(int employee_number) {
        this.employee_number = employee_number;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Duration getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Duration timeIn) {
        this.timeIn = timeIn;
    }

    public Duration getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Duration timeOut) {
        this.timeOut = timeOut;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "employee_number=" + employee_number +
                ", l_name='" + l_name + '\'' +
                ", f_name='" + f_name + '\'' +
                ", date=" + date +
                ", timeIn=" + timeIn +
                ", timeOut=" + timeOut +
                '}';
    }

    public String getEmployeeId() {
        return String.valueOf(getEmployee_number());
    }
}
