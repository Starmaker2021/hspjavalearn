package thirdphase.houserent.view;

import thirdphase.houserent.domain.House;
import thirdphase.houserent.service.HouseService;
import thirdphase.houserent.utils.Utility;

public class HouseView {
    public void showList() {
        House[] houses = new HouseService().houselist(10);
        System.out.println("----------房屋列表----------");
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态");
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) break;
            System.out.println(houses[i]);
        }
        System.out.println("----------房屋列表----------");
    }

    ;

    public void showMenu() {
        boolean loop = true;
        char key;
        do {
            System.out.println("----------房屋出租系统菜单----------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退 出");
            System.out.println("请输入你的选择：");

            key = Utility.readChar();
            switch (key) {
                case '1':
                    System.out.println("1");
                    break;
                case '2':
                    System.out.println("2");
                    break;
                case '3':
                    System.out.println("3");
                    break;
                case '4':
                    System.out.println("4");
                    break;
                case '5':
                    showList();
                    break;
                case '6':
                    System.out.println("6");
                    loop = false;
                    break;

            }
        } while (loop);
    }

    ;
}
