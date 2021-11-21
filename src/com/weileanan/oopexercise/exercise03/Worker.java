package com.weileanan.oopexercise.exercise03;

public class Worker extends Staff{
    public Worker(String name, int daySalary, int day) {
        super(name, daySalary, day);
    }

    @Override
    public void totalSalary(Staff staff) {
        System.out.println("经理"+getName()+"工资为"+getDaySalary()*getDay()*1);
    }
}
