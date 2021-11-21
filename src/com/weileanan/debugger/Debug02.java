package com.weileanan.debugger;

public class Debug02 {
    private String name;
    private int age;
    private int salary;

    public Debug02(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {
        String name = "anan";
        int age = 22;
        int salary = 25000;
        Debug02 debug02 = new Debug02(name,age,salary);
    }
}
