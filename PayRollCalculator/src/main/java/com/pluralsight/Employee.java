package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeId, double payRate, double hoursWorked, String name) {
        this.employeeId = employeeId;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }


    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay() {
        return this.payRate * this.hoursWorked;
    }


}


