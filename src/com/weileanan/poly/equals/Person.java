package com.weileanan.poly.equals;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean equals(Object person) {
        if (this == person) {
            return true;
        }
        if (person instanceof Person) {
            Person a = (Person) person;
            return this.name.equals(a.name) && this.age == a.age && this.gender == a.gender;
        }
        return false;
    }
}
