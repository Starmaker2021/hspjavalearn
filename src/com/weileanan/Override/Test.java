package com.weileanan.Override;

public class Test {
    public static void main(String[] args) {
        Person anan = new Person("anan", 25);
        Student anan1 = new Student("anan", 25, 133996, 99);
        System.out.println(anan.say());
        System.out.println(anan1.say());
    }
}
