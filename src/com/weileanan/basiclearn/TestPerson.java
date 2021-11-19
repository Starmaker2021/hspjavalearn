package com.weileanan.basiclearn;

public class TestPerson {
    public static void main(String[] args) {
        Person01 a = new Person01("ShiTan", 25);
        Person01 b = new Person01("ShiTan", 25);
        System.out.println(a.comparePerson(b));
    }
}

class Person01 {
    String name;
    int age;

    public Person01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean comparePerson(Person01 a) {
        if (this.name.equals(a.name) && this.age == a.age) {
            return true;
        } else {
            return false;
        }
    }
}