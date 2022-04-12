package secondphase.chapter10.homework06;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car(60);
        Car car2 = new Car(15);
        Car car3 = new Car(36);
        car1.new AirCondition().flow();
        System.out.println("============");
        car2.new AirCondition().flow();
        System.out.println("============");
        car3.new AirCondition().flow();
    }
}
