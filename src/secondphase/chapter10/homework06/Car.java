package secondphase.chapter10.homework06;

public class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class AirCondition{
        public void flow(){
            if(temperature>40){
                while(temperature>40){
                    temperature--;
                    System.out.println(temperature);
                }
                System.out.println("降温成功");
            }
            else if(temperature<20){
                while(temperature<20){
                    temperature++;
                    System.out.println(temperature);
                }
                System.out.println("升温成功");
            }
            else{
                System.out.println("温度正常，无需操作");
            }
        }
    }
}
