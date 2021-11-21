package com.weileanan.debugger;

public class Debug01 {
    /**
     * @author:TanShi
     * @date:2021/11/21
     * @description:逐行执行代码
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("i=" + i);
            System.out.println("sum=" + sum);
        }
        System.out.println("退出for");
    }
}
