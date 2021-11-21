package com.weileanan.poly.equals;

public class test {
    public static void main(String[] args) {
        Person p1 = new Person("tanshi",22,'男');
        Person p2 = new Person("tanshi",22,'男');
        System.out.println(p1.equals(p2));
    }
}
