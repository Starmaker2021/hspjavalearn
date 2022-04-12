package secondphase.trycatch.Exercise01;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");

        String input = myScanner.nextLine();
        try {
            int num = Integer.parseInt(input);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class customException extends RuntimeException{
    public customException(String message) {
        super(message);
    }
}

