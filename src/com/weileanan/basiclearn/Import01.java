package com.weileanan.basiclearn;

import java.util.Arrays;

public class Import01 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,5};
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
