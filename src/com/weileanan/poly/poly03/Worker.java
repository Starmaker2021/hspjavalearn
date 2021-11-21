package com.weileanan.poly.poly03;

public class Worker extends Employee {
    public Worker(String name, int monthSalary) {
        super(name, monthSalary);
    }

    public void work() {
        System.out.println("员工" + getName() + "正在工作");
    }
}
