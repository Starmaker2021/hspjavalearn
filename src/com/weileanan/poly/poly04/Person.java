package com.weileanan.poly.poly04;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    void feed(Animal animal, Food food) {
        System.out.println(animal.getName()+"eat"+food.getName());
    }
}
