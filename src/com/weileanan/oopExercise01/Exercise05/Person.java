package com.weileanan.oopExercise01.Exercise05;

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

    public void judgePerson(Person person) {
        if (this == person) {
            System.out.println("It is the same person");
        } else if (person instanceof Person) {
            Person temp = (Person) person;
            if (this.getName() == temp.getName() && this.getGender() == temp.getGender() && this.getAge() == temp.getAge()){
                System.out.println("They are the same person!");
            }
            else{
                System.out.println("不是一个人儿！");
            }
        }
    }
}
