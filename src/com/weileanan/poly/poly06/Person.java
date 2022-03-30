package com.weileanan.poly.poly06;

public class Person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
    public String say(){
       return this.getName();
    }
}
