package com.weileanan.poly;

public class poly05 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.a);
        System.out.println(a instanceof B);
    }
}
class A{
    int a = 0;
}
class B extends A{
    int a = 1;
}