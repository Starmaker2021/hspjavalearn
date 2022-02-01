package com.weileanan.secondlearn.constructor;

public class ThisExercise {
    public static void main(String[] args) {
        Person01 chan = new Person01("chan", 66);
        Person01 li = new Person01("chan", 66);
        System.out.println(chan.compareTo(li));
    }
}

class Person01 {
    String name;
    int age;

    public Person01(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public boolean compareTo(Person01 p2) {
        if (this.age == p2.age && this.name.equals(p2.name)) {
            return true;
        } else {
            return false;
        }
    }
}