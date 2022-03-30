package com.weileanan.oopExercise01.Exercise06;

public class Person {
    private String name;
    private char sex;
    private int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play(){
        return this.getName();
    }
    public void printInfo(){
        System.out.print("姓名：");
        System.out.println(this.getName());
        System.out.print("年龄：");
        System.out.println(this.getAge());
        System.out.print("性别：");
        System.out.println(this.getSex());
        if(this instanceof Student){
            Student stu = (Student)this;
            System.out.print("学号是：");
            System.out.println(stu.studentId);
            stu.study();
            System.out.println(this.play());
        }else if(this instanceof Teacher){
            Teacher tea = (Teacher) this;
            System.out.print("工龄是：");
            System.out.println(tea.workAge);
            tea.teach();
            System.out.println(this.play());
        }
    }
}
