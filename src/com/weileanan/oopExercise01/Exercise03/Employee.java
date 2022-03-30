package com.weileanan.oopExercise01.Exercise03;

public class Employee extends Staff{
    public Employee(String name, int salaryDay, int workDays) {
        super(name, salaryDay, workDays);
        super.setGrade(1);
    }

    @Override
    public void printSalary() {
        System.out.println("员工工资是："+super.getSalaryDay()*super.getWorkDays()*super.getGrade());
    }

}
