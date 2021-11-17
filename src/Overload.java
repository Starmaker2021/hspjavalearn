public class Overload {
    public static void main(String[] args) {
        MyTool06 tool = new MyTool06();
        tool.m(10);
        tool.m(10,10);
        tool.m("sss");
    }
}
class MyTool06{
    public void m(int a) {
        System.out.println(a * a);
    }

    public void m(int a, int b) {
        System.out.println(a + b);
    }

    public void m(String a) {
        System.out.println(a);
    }
}