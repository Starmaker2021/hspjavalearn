package com.weileanan.basiclearn;

import java.util.Scanner;

public class Recursion01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int a = myScanner.nextInt();
        MyTools03 tool = new MyTools03();
        System.out.println(tool.fibonacci(a));
        System.out.println(tool.monkeyEatPeach(1));
    }
}

class MyTools03 {
    public int fibonacci(int a) {
        int b;
        if (a > 2) {
            b = fibonacci(a - 1) + fibonacci(a - 2);
        } else {
            b = 1;
        }
        return b;
    }

    public int monkeyEatPeach(int a) {
        if(a == 10){
            return 1;
        }
        else{
            return 2*(monkeyEatPeach(a+1)+1);
        }
    }
}