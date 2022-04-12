package secondphase.chapter10.homework01;

public class TestFrock {
    public static void main(String[] args) {
        Frock[] frocks = new Frock[3];
        for (int i = 0; i < 3; i++) {
            frocks[i] = new Frock();
            System.out.println(frocks[i].getSerialNum());
        }
    }
}
