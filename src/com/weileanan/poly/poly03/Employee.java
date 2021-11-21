package com.weileanan.poly.poly03;

public class Employee {
    private String name;
    private int monthSalary;

    public Employee(String name, int monthSalary) {
        this.name = name;
        this.monthSalary = monthSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getAnnual() {
        int annual = 12 * monthSalary;
        return annual;
    }


}
