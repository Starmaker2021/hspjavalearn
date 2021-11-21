package com.weileanan.oopexercise.exercise03;

public class Staff {
    private String name;
    private int daySalary;
    private int day;

    public Staff(String name, int daySalary, int day) {
        this.name = name;
        this.daySalary = daySalary;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(int daySalary) {
        this.daySalary = daySalary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void totalSalary(Staff staff){
    }

}

