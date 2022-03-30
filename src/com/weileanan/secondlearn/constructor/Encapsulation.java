package com.weileanan.secondlearn.constructor;

public class Encapsulation {
    public static void main(String[] args) {
        Person02 person02 = new Person02();
        person02.setAge(2222);
        person02.setName("liooooooo");
        person02.setSalary(3000);
        person02.printInfo();
    }
}

class Person02 {
    public String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 6)
            this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120)
            this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(this.getName() + " " + this.getAge() + " " + this.getSalary());
    }
}