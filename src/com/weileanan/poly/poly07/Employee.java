package com.weileanan.poly.poly07;

public class Employee extends Staff {
    public Employee(String name, int salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("工人" + this.getName() + "正在工作");
    }

    @Override
    public int getAnnual() {
        return 1 * super.getAnnual();
    }
}
