package com.weileanan.oopExercise01.Exercise01;

public class Test {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("zhang", 25);
        person[1] = new Person("li", 23);
        person[2] = new Person("wu", 21);
        Person[] result = sortPersonAge(person);
        printArray(result);
    }

    public static Person[] sortPersonAge(Person[] person) {
        Person person01;
        for (int i = 0; i < person.length - 1; i++) {
            //外层循环是 4 次
            for (int j = 0; j < person.length - 1 - i; j++) {
                //4 次比较-3 次-2 次-1 次
                // 如果前面的数>后面的数，就交换
                if (person[j].getAge() > person[j + 1].getAge()) {
                    person01 = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = person01;
                }
            }
        }
        return person;
    }

    public static void printArray(Person[] person) {
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getName() + ">>>" + person[i].getAge()
            );
        }
    }
}