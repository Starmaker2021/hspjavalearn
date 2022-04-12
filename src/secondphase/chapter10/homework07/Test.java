package secondphase.chapter10.homework07;

public class Test {
}
interface ColorShow{
    void show();
}
enum Color implements ColorShow{
    Yellow(255,255,0),
    Red(255,0,0),
    Blue(0,0,255),
    Black(0,0,0),
    Green(0,255,0);
    //颜色属性

    int redValue;
    int blueValue;
    int yellowValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.blueValue = blueValue;
        this.yellowValue = yellowValue;
    }

    @Override
    public void show() {
        System.out.println(this.blueValue+"  "+this.redValue+"  "+this.yellowValue);
    }
}