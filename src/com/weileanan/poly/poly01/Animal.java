package com.weileanan.poly.poly01;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("animal在进食");
    }
}
