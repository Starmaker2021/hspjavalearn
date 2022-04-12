package secondphase.chapter10.homework01;

public class Frock {
    //衣服出厂序列号起始值
    private static int currentNum = 100000;
    private static int serialNum;
    //序列号生成方法，每调用一次，序列号+100，返回值
    public static int getNextNum() {
         currentNum += 100;
        return currentNum;
    }

    public static int getSerialNum() {
        serialNum = getNextNum();
        return serialNum;
    }
}
