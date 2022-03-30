package com.weileanan.oopExercise01.Exercise06;

public class Student extends Person{
    public long studentId;

    public Student(String name, char sex, int age, long studentId) {
        super(name, sex, age);
        this.studentId = studentId;
    }

    public void study(){
        System.out.println("我承诺：会好好学习！");
    }

    @Override
    public String play() {
        return super.play()+"爱玩足球";
    }
}
