package com.weileanan.oopExercise01.Exercise03;

public class Test {
    public static void main(String[] args) {
        Manager zhang = new Manager("zhang",1000,100);
        Employee li = new Employee("li",800,100);
        zhang.printSalary();
        li.printSalary();
    }
}
