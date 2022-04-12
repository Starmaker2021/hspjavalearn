package secondphase.enum01;

public class EnumExercise {
    public static void main(String[] args) {
        Week[] week = Week.values();
        for (Week day : week) {
            System.out.println(day.des);
            Week.Monday.sleep();
        }


    }
}
interface sleep{
   void sleep();
}
enum Week implements sleep{
    Monday("礼拜一"),
    Tuesday("礼拜二"),
    Wednesday("礼拜三"),
    Thursday("礼拜四"),
    Friday("礼拜五"),
    Saturday("礼拜六"),
    Sunday("礼拜天");
    String des;

    Week(String des) {
        this.des = des;
    }


    @Override
    public void sleep() {
        System.out.println("睡觉了");
    }
}