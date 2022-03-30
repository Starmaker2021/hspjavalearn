package com.weileanan.abstract_;

public class Test {
    public static void main(String[] args) {
        Manager zhang = new Manager("zhang","aa123",123,123);
        Worker shi = new Worker("shi","asd23",133);
        zhang.work();
        shi.work();
    }
}
