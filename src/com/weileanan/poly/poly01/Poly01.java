package com.weileanan.poly.poly01;

public class Poly01 {
    public static void main(String[] args) {
        Master anan = new Master("anan");
        Dog 大黄 = new Dog("大黄");
        Bone 大棒骨 = new Bone("大棒骨");
        anan.feed(大黄, 大棒骨);

        Animal animal = new Dog("dog");
        animal.eat();
    }
}
