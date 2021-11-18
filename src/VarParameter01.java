public class VarParameter01 {
    /**
     * @author:TanShi
     * @date:2021/11/18
     * @description:可变参数
     */
    public static void main(String[] args) {
        MyTools06 tool = new MyTools06();
        System.out.println(tool.sum01(1, 2, 3));
        tool.showScore("tanshi",99,100,100,98);
    }
}

class MyTools06 {
    public int sum01(int... nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }

    public void showScore(String name, int... nums) {
        System.out.print(name + "\t");
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.print(sum);
    }

}