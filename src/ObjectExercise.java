public class ObjectExercise {
    public static void main(String[] args) {


//第一题
        MyTool07 tool = new MyTool07();
        double[] array1 = {2.2, 3.3, 4.4, 5.5};
        tool.max(array1);

        //第二题
        String[] array2 = {"zhangsan","lisi","wangwu"};
        tool.find(array2,"zhangsan");

        int i =0;
        System.out.println(i++);
        System.out.println(i++);

        System.out.println(tool.method(tool.method(100,50),10 ));
    }
}

class MyTool07 {
    public void max(double[] array1) {
        double max = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.println(max);
    }

    public void find(String[] array2,String s1){
        for (int i = 0; i < array2.length; i++) {
            if (array2[i]==s1) {
                System.out.println(i);
            }
        }
    }

    public double method(double a,double b){
        double res = 0;
        if(a > b){
            res = a;
        }else{
            res = b;
        }
        return res;
    }
}
