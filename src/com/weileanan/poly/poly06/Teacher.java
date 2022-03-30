package com.weileanan.poly.poly06;

public class Teacher extends Person {
    int salary;

    public Teacher(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
       return super.say()+this.getSalary();
    }
    public void teach(){
        String a = this.getName()+"在教书";
        System.out.println(a);
    }
}

