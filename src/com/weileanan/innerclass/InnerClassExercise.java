package com.weileanan.innerclass;

public class InnerClassExercise {
    public static void main(String[] args) {
        Cellphone phone = new Cellphone();
        phone.alarmClock(phone.bell1);
        phone.alarmClock(phone.bell2);

    }

}
interface Bell{
    void ring();
}
class Cellphone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
    Bell bell1 =new Bell(){
        @Override
        public void ring() {
            System.out.println("起床啦");
        }
    };
    Bell bell2 =new Bell(){
        @Override
        public void ring() {
            System.out.println("上课啦");
        }
    };
}
