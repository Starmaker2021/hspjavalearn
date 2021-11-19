package com.weileanan.basiclearn;

public class Queen8 {
    /**
     * @author:TanShi
     * @date:2021/11/17
     * @description:用递归算法解决八皇后问题
     */
    public static void main(String[] args) {
        Queen8 queen = new Queen8();
        queen.put(0);
        System.out.println(queen.count);
    }

    int[] solution = new int[8];
    int count = 0;

    //放置棋子
    public void put(int n) {
        if (n == 8) {
            print(solution);
            count++;
            return;
        } else {
            for (int i = 0; i < 8; i++) {
                solution[n] = i;
                if (judge(n)) {
                    put(n + 1);
                }
            }
        }
    }

    //判断是否能放置
    public boolean judge(int a) {
        for (int i = 0; i < a; i++) {
            if (solution[i] == solution[a] || Math.abs(a - i) == Math.abs(solution[i] - solution[a])) {
                return false;
            }
        }
        return true;
    }

    //打印一维数组
    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}