package com.weileanan.oopExercise01.Exercise02;

public class Lecturer extends Teacher {
    public Lecturer(String name, int age, String post, double salary, int grade) {
        super(name, age, post, salary);
        this.setGrade(1);
    }

    @Override
    public void introduce() {
        System.out.println("姓名:\t" + this.getName() + "\t年龄:\t" + this.getAge() + "\t职称:\t" + getPost() + "\t薪水：\t" + this.getSalary() + "\t工资级别:\t" + super.getGrade());
    }
}
