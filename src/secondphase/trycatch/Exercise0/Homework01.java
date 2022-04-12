package secondphase.trycatch.Exercise0;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double a = myScanner.nextDouble();
        double b = myScanner.nextDouble();
        try {
            System.out.println(cal(a,b));
        } catch (NumberFormatException e1) {
            System.out.println("数据异常");
        }catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("空指针");
        }
        catch (ArithmeticException e3) {
            System.out.println("计算错误");;
        }
    }

    public static Double cal(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }
}
