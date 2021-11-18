public class Constructor01 {
    public static void main(String[] args) {
        Person xiaozhang = new Person("小张", 25);
    }
}

class Person {
    String name;
    int age;

    public Person(String pName, int Page) {
        name = pName;
        age = Page;
    }
}