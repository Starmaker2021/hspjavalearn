package com.weileanan.basiclearn;

public class MiGong {
    /**
     * @author:TanShi
     * @date:2021/11/17
     * @description:用递归解决迷宫问题，0表示同路，1表示障碍物；
     */
    public static void main(String[] args) {
        int[][] MiGong = new int[8][7];
        //最上和最下两行设为1
        for (int i = 0; i < 7; i++) {
            MiGong[0][i] = 1;
            MiGong[7][i] = 1;
        }
        //最左和最右两列设为1
        for (int i = 0; i < 8; i++) {
            MiGong[i][0] = 1;
            MiGong[i][6] = 1;
        }
        MiGong[3][1] = 1;
        MiGong[3][2] = 1;
        System.out.println("======当前地图情况=====");
        myTools03 tool = new myTools03();
        tool.printArray(MiGong);
        System.out.println("======更改后地图情况=====");
        tool.findWay(MiGong, 1, 1);
        tool.printArray(MiGong);
    }
}

class myTools03 {
    //打印列表
    public void printArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    //找路算法的规则：
    //定义：0代表未走过的路，1代表障碍物，2代表走过的能走的路，3代表走过但走不通的路
    //找路顺序：下右上左
    //如果MiGong[6][5]==2，说明已经找到通路。
    //形参列表为输入的迷宫和起点的坐标
    public boolean findWay(int[][] migong, int x, int y) {
        if (migong[6][5] == 2) {
            return true;
        } else {
            if (migong[x][y] == 0) {
                migong[x][y] = 2;
                if (findWay(migong, x , y+1)) {
                    return true;
                } else if (findWay(migong, x+1, y)) {
                    return true;
                } else if (findWay(migong, x - 1, y)) {
                    return true;
                } else if (findWay(migong, x, y - 1)) {
                    return true;
                } else {
                    migong[x][y] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}