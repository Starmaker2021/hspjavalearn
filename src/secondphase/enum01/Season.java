package secondphase.enum01;

/**
 * @author:TanShi
 * @date:2022/4/8
 * @description:
 */
public class Season {
    public static void main(String[] args) {
        System.out.println(Season01.AUTUMN.ordinal());
        System.out.println(Season01.WINTER.compareTo(Season01.SUMMER));
        Season01[] values = Season01.values();
        for(Season01 season:values){
            System.out.println(season);
        };
    }
}

enum Season01 {

    SPRING("春天", "暖和"),
    SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"),
    WINTER("冬天", "寒冷");
    public String name;
    public String des;

    Season01(String name, String def) {
        this.name = name;
        this.des = def;
    }

    public String getName() {
        return name;
    }

    public String getDef() {
        return des;
    }

    @Override
    public String toString() {
        return "Season01{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}