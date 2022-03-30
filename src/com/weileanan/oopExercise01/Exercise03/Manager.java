package com.weileanan.oopExercise01.Exercise03;

public class Manager extends Staff{
    public Manager(String name, int salaryDay, int workDays) {
        super(name, salaryDay, workDays);
        super.setGrade(3);
    }

    @Override
    public void printSalary() {
        System.out.println("经理工资是："+(1000+super.getSalaryDay()*super.getWorkDays()*super.getGrade()));
    }
}
