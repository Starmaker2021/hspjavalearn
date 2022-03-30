package com.weileanan.override1;

public class Student extends Person{
    private double score;
    private int id;

    public Student(String name, int age, double score, int id) {
        super(name, age);
        this.score = score;
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String say() {
        return super.say() + "Id:"+this.getId()+"Score:"+getScore();
    }
}
