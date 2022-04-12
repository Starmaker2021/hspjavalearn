package secondphase.chapter10.homework04;

public class Homework04 {
    public static void main(String[] args) {
A.fo();

    }
}

class A {

    private static final int num1 = 44;

    static void fo() {
        class B {

            private static final int num1 = 33;

            public void show() {
                System.out.println(num1 + "父类变量" + A.num1);
            }
        }

        B b = new B();
        b.show();
    }
}

