package com.weileanan.oopexercise.exercise02;

public class Test {
    public static void main(String[] args) {
        Professor zhao = new Professor("zhao", 25, "1.3", 25000);
        AssociateProfessor qian = new AssociateProfessor("qian", 25, "1.2", 25000);
        Lecturer sun = new Lecturer("suno", 25, "1.1", 25000);
        zhao.introduce();
        qian.introduce();
        sun.introduce();

    }
}
