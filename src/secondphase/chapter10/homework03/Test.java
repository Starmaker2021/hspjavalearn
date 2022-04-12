package secondphase.chapter10.homework03;

public class Test {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        phone.calculate(new calculator() {
            @Override
            public void work(int num1,int num2) {
                System.out.println(num1 + num2);
            }
        }, 1, 2);
    }
}

class CellPhone {
    void calculate(calculator calculator, int num1, int num2) {
        calculator.work(num1, num2);
    }
}

interface calculator {
    void work(int num1, int num2);
}