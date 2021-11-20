package com.weileanan.poly.poly02;

public class poly02 {
    public static void main(String[] args) {
        Person [] person = new Person[3];
        person[0] = new Person("anan",25);
        person[1] = new Teacher("anan",25,25000);
        person[2] = new Student("anan",25,100);

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].say());

            if(person[i] instanceof Student){
                ((Student)person[i]).study();
            }else if(person[i] instanceof Teacher){
                ((Teacher)person[i]).teach();
            }else{
                System.out.println("类型有误");
            }
        }
    }
}
