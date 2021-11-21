package com.weileanan.oopexercise.exercise02;

public class Teacher {
    private String name;
    private int age;
    private String post;
    private double Salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void introduce() {
        System.out.println(this.getName() + "\t" + this.getAge() + "\t" + this.getPost() + "\t" + this.getSalary());
    }
}
