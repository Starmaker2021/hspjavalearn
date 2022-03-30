package com.weileanan.abstract_;

public class Worker extends Employee{
    public Worker(String name, String id, int salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工"+super.getName()+"正在工作");
    }
}
