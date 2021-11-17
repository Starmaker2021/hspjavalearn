
public class HanoiTower {
    /**
     * @author:TanShi
     * @date:2021/11/17
     * @description:递归实现汉诺塔
     */
    public static void main(String[] args) {
        MyTools04 tool = new MyTools04();
        tool.HanoiTower(12, 'a', 'b', 'c');
    }
}

class MyTools04 {
    public void HanoiTower(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            HanoiTower(num - 1, a, c, b);
            System.out.println(a + "->" + c);
            HanoiTower(num - 1, b, a, c);
        }
    }
}