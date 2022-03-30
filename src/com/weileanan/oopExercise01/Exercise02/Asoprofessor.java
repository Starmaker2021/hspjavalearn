package com.weileanan.oopExercise01.Exercise02;

public class Asoprofessor extends Teacher {
    public Asoprofessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
        this.setGrade(2);
    }

    @Override
    public void introduce() {
        System.out.println("姓名:\t" + this.getName() + "\t年龄:\t" + this.getAge() + "\t职称:\t" + getPost() + "\t薪水：\t" + this.getSalary() + "\t工资级别:\t" + super.getGrade());
    }
}
