package com.weileanan.poly.poly06;

public class Student extends Person{
    int grade;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String say() {
        return super.say()+this.getGrade();
    }
}
