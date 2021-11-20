package com.weileanan.poly.poly02;

public class Teacher extends Person{
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        salary = salary;
    }

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say()+"\t"+getSalary();
    }

    public void teach(){
        System.out.println("老师"+getName()+"正在授课");
    }
}
