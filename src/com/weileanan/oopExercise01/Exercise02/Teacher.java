package com.weileanan.oopExercise01.Exercise02;

public class Teacher {
    public String name;
    private int age;
    private String post;
    private double salary;
    private int grade;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
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
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void introduce() {
        System.out.println("姓名:\t" + this.getName() + "\t年龄:\t" + this.getAge() + "\t职称:\t" + getPost() + "\t薪水：\t" + this.getSalary());
    }
}
