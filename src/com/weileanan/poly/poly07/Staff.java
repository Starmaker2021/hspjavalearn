package com.weileanan.poly.poly07;

public class Staff {
    private String name;
    private int salary;

    public Staff(String name, int salary) {

        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnual() {
        return 12 * this.getSalary();
    }
}
