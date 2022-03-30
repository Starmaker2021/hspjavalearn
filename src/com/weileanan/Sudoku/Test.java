package com.weileanan.Sudoku;

public class Test {
    public static void main(String[] args) {
        // 号称世界上最难数独
        int[][] sudoku = {
                {3, 0, 0, 7, 0, 0, 0, 0, 0},
                {4, 0, 0, 0, 6, 5, 0, 0, 0},
                {9, 0, 0, 8, 0, 0, 0, 0, 0},
                {0, 0, 6, 0, 0, 0, 0, 0, 3},
                {0, 7, 5, 0, 8, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 4, 0, 1},
                {0, 0, 0, 0, 0, 4, 3, 0, 2},
                {0, 0, 9, 0, 5, 0, 1, 0, 7},
                {0, 0, 0, 0, 7, 0, 8, 0, 0}};
        Sudoku s = new Sudoku(sudoku);
        s.backTrace(0, 0);
    }
}
