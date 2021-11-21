package com.weileanan.oopexercise.exercise03;

public class Test {
    public static void main(String[] args) {
        Manager zhao = new Manager("zhao", 25, 25);
        Worker qian = new Worker("qian",25,25);

        zhao.totalSalary(zhao);
        qian.totalSalary(qian);
    }
}
