package com.weileanan.oopExercise01.Exercise06;

public class Test {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Teacher("zhang", 'F', 25, 10);
        person[1] = new Teacher("qian", 'M', 29, 10);
        person[2] = new Student("sun", 'M', 15, 20178);
        person[3] = new Student("li", 'F', 13, 201783);
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                Person temp;
                if (person[j].getAge() > person[j + 1].getAge()) {
                    temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            person[i].printInfo();
            if (i < person.length - 1) {
                System.out.println("=================");
            }
        }

    }

}
