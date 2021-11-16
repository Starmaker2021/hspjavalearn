import java.util.Scanner;

public class MethodExercise01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int input = myScanner.nextInt();
        Tools01 tool = new Tools01();
        System.out.println(tool.JudgeParity(input));
        tool.printArray(5,5,'t');
    }
}

class Tools01 {
    public boolean JudgeParity(int input) {
        boolean parity;
        if (input / 2 == 0) {
            parity = false;
        } else {
            parity = true;
        }
        return parity;
    }

    public void printArray(int i,int j,char c){
        for (int m =0;m<i;m++){
            for(int n = 0;n<j;n++){
                System.out.print(c+"\t");
            }
            System.out.println();
        }
    }
}