package com.weileanan.innerclass.Exercise02;

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

    }
}

interface Bell {
    void ring();
}

class Phone {
    void alarmClock(Bell bell) {
        bell.ring();
    }

}
