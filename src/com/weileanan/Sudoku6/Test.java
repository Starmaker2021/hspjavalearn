package com.weileanan.Sudoku6;

public class Test {
    public static void main(String[] args) {
        // 号称世界上最难数独
        int[][] sudoku = {
                {0, 0, 0, 0, 0, 4},
                {0, 0, 0, 2, 1, 0},
                {1, 3, 2, 0, 0, 5},
                {5, 0, 0, 1, 3, 2},
                {0, 5, 3, 0, 0, 0},
                {6, 0, 0, 0, 0, 0}};
        Sudoku s = new Sudoku(sudoku);
        s.backTrace(0, 0);
    }
}
