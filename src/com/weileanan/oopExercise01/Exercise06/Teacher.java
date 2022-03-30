package com.weileanan.oopExercise01.Exercise06;

public class Teacher extends Person{
    public int workAge;

    public Teacher(String name, char sex, int age, int workAge) {
        super(name, sex, age);
        this.workAge = workAge;
    }
    public void teach(){
        System.out.println("我承诺：会好好教书！");
    }
    @Override
    public String play() {
        return super.play()+"爱玩象棋";
    }
}
