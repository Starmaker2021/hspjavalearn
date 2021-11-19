package com.weileanan.basiclearn;

public class Method {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {1, 2}};
        MyTools tool = new MyTools();
        tool.printArray(array);
    }
}

class MyTools{
    public void printArray(int[][] array){
        for(int i = 0; i< array.length;i++){
            for(int j = 0; j< array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}