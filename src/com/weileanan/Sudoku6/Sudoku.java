package com.weileanan.Sudoku6;

public class Sudoku {
    //属性为一个二维数组
    private int[][] matrix;

    //构造器创建一个数组，即输入题目
    public Sudoku(int[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * 数独算法
     *
     * @param i 行号
     * @param j 列号
     */
    public void backTrace(int i, int j) {
        if (i == 5 && j == 6) {
            //已经成功了，打印数组即可
            System.out.println("有唯一解");
            printArray();
            return;
        }

        //已经到了列末尾了，还没到行尾，就换行
        if (j == 6) {
            i++;
            j = 0;
        }

        //如果i行j列是空格，那么才进入给空格填值的逻辑
        if (matrix[i][j] == 0) {
            for (int k = 1; k <= 6; k++) {
                //判断给i行j列放1-9中的任意一个数是否能满足规则
                if (check(i, j, k)) {
                    //将该值赋给该空格，然后进入下一个空格
                    matrix[i][j] = k;
                    backTrace(i, j + 1);
                    //初始化该空格
                    matrix[i][j] = 0;
                }
            }
        } else {
            //如果该位置已经有值了，就进入下一个空格进行计算
            backTrace(i, j + 1);
        }
    }

    /**
     * 判断给某行某列赋值是否符合规则
     *
     * @param row    被赋值的行号
     * @param line   被赋值的列号
     * @param number 赋的值
     * @return
     */
    private boolean check(int row, int line, int number) {
        //判断该行该列是否有重复数字
        for (int i = 0; i < 6; i++) {
            if (matrix[row][i] == number || matrix[i][line] == number) {
                return false;
            }
        }
        //判断小九宫格是否有重复
        int tempRow = row / 2;
        int tempLine = line / 3;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[tempRow * 2 + i][tempLine * 3 + j] == number) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * 打印矩阵
     */
    public void printArray() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
