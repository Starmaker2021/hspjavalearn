package com.weileanan.oopExercise01.Exercise03;

public class Staff {
    String name;
    int salaryDay;
    int workDays;
    int grade;

    public Staff(String name, int salaryDay, int workDays) {
        this.name = name;
        this.salaryDay = salaryDay;
        this.workDays = workDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaryDay() {
        return salaryDay;
    }

    public void setSalaryDay(int salaryDay) {
        this.salaryDay = salaryDay;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }
    public void printSalary(){
        System.out.println("工资是：");
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
