package com.weileanan.poly.poly04;

public class Poly04 {
    public static void main(String[] args) {
        Person zhang = new Person("zhang");
        Animal petty = new Pig("petty");
        Food damifan = new Rice("damifan");
        zhang.feed(petty,damifan);
    }
}
