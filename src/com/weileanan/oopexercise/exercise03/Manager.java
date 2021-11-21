package com.weileanan.oopexercise.exercise03;

public class Manager extends Staff{
    public Manager(String name, int daySalary, int day) {
        super(name, daySalary, day);
    }
    public void totalSalary(Staff staff) {
        System.out.println("经理"+getName()+"工资为"+(1000+getDaySalary()*getDay()*1.2));
    }
}
