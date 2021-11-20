package com.weileanan.poly.poly02;

public class Student extends Person {
    int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public String say() {
        String res = super.say()+"\t"+getScore();
        return res;
    }

    public void study(){
        System.out.println("学生"+getName()+"正在学习");
    }
}
