public class Recursion {
    public static void main(String[] args) {
        MyTools02 mytools = new MyTools02();
        mytools.test(50);
    }
}


class MyTools02 {
    public void test(int n) {
        n--;
        if (n > 2) {
            test(n);
        }
        System.out.println(n);
    }
}