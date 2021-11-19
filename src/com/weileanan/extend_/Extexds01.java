package com.weileanan.extend_;

import com.weileanan.extend_.improve_.Graduate;
import com.weileanan.extend_.improve_.Pupil;

public class Extexds01 {
    public static void main(String[] args) {
        Pupil tanshi = new Pupil();
        tanshi.name = "tanshi";
        tanshi.age = 25;
        tanshi.testing();
        tanshi.setScore(60);
        System.out.println(tanshi.getAge()+ tanshi.getScore()+tanshi.getName());

        System.out.println("==================");
        Graduate tanshi1 = new Graduate();
        tanshi1.name = "tanshi1";
        tanshi1.age = 26;
        tanshi1.testing();
        tanshi1.setScore(70);
        System.out.println(tanshi1.getAge()+ tanshi1.getScore()+tanshi1.getName());
    }
}
