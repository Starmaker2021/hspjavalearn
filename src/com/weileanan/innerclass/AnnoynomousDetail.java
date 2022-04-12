package com.weileanan.innerclass;

public class AnnoynomousDetail {
    public static void main(String[] args) {
        Outer outer1 = new Outer();
        outer1.f1();

    }
}

class Outer {
    private int n1 = 99;

    public void f1() {
        Person li = new Person("li") {
            @Override
            public void hi() {
                System.out.println("匿名内部类重写");
            }

        };
        li.hi();
    }
}


class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void hi() {
        System.out.println("hi");
    }
}