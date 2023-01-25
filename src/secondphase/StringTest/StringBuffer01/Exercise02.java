package secondphase.StringTest.StringBuffer01;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        sb.append(myScanner.next());
        int i = sb.lastIndexOf(".");
        for (int j = i; j > 3 ; j-=3) {
            sb.insert(j-3,",");
        }
        System.out.println(sb);
    }
}
