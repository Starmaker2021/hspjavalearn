package com.weileanan.oopexercise.exercise01;

public class Test {
    public static void main(String[] args) {
        Person zhang = new Person("zhang", 12, "mid");
        Person li = new Person("li", 14, "mid");
        Person lu = new Person("lu", 13, "mid");

        Person[] person = new Person[3];
        person[0] = zhang;
        person[1] = li;
        person[2] = lu;
        Person[] sortedPerson = new Person[3];
        for (int i = 0; i < 3; i++) {
            sortedPerson[i] = person[i];
            System.out.println(person[i].getName() + "\t" + person[i].getAge() + "\t" + person[i].getJob());
        }
    }

    public Person[] sortAge(Person[] person) {
        for (int i = 0; i < person.length; i++) {
            for (int j = person.length - 1 - i - 1; j >= 0; j--) {
                if (person[person.length - 1 - i].getAge() < person[j].getAge()) {
                    int temp = person[j].getAge();
                    person[j].setAge(person[person.length - 1 - i].getAge());
                    person[person.length - 1 - i].setAge(temp);
                }
            }
        }
        return person;
    }
}
