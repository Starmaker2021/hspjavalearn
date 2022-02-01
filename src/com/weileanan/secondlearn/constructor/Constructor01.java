package com.weileanan.secondlearn.constructor;

public class Constructor01 {
    public static void main(String[] args) {
        Person zhang = new Person("zhang", 45);
        Person zhan = new Person("zhan");
        System.out.println(zhang.age);
        System.out.println(zhan.name);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor01 initialization is complete！");
    }
    public Person(String name) {
        this.name = name;
        System.out.println("Constructor02 initialization is complete！");
    }
}