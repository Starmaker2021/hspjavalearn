package secondphase.chapter14.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add("jack");
        System.out.println("list=" + list);

        List list1 = new ArrayList();
        list1.add(new Dog("aa", 2));
        list1.add(new Dog("aa", 2));
        list1.add(new Dog("aa", 2));
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next.toString());
        }
        for (Object o :list1) {
            System.out.println(o.toString());
        }

        ArrayList list3 = new ArrayList();
        list3.add(new String("hello"));
        list3.add(new String("hello"));
        list3.add(new String("hello"));
        list3.add(new String("hello"));
        list3.add(new String("hello"));
        list3.add(new String("hello"));
        list3.add(new String("hello"));
        list3.add(new String("hello"));
        list3.add(new String("hello"));
        list3.add(new String("hello"));
        list3.add(2,"hsp");
        list3.remove(6);
        list3.set(9,"sss");
        System.out.println(list3.get(3));
        System.out.println(list3);

    }

}

class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}