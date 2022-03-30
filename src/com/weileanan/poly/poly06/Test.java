package com.weileanan.poly.poly06;

public class Test {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("a");
        person[1] = new Student("b", 22);
        person[2] = new Teacher("c", 22222);
        for (int i = 0; i <= 2; i++) {
            String a = person[i].say();
            System.out.println(a);
        }
        ((Teacher)person[2]).teach();

    }
}
