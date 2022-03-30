package com.weileanan.houserent.view;

import com.weileanan.houserent.domain.House;
import com.weileanan.houserent.service.HouseService;
import com.weileanan.houserent.utils.Utility;

import java.util.Scanner;

public class HouseMenu {
    public char key;
    public boolean loop = true;
    public HouseService houseService = new HouseService(12);
    Scanner input = new Scanner(System.in);

    public void showMenu() {
        do {
            System.out.println("================房屋出租系统================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退 出");
            System.out.print("请输入你的选择（1~6）：");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    System.out.println("----------------添加房屋----------------");
                    System.out.println("新增房源");
                    System.out.print("姓名：");
                    String name = Utility.readString(15);
                    System.out.print("电话：");
                    String phone = input.next();
                    System.out.print("地址：");
                    String address = input.next();
                    System.out.print("月租：");
                    int rent = input.nextInt();
                    System.out.print("状态：（未出租/已出租）：");
                    String state = input.next();
                    houseService.addHouse(name,phone,address,rent,state);
                    break;
                case '2':
                    System.out.println("查找房源");
                    break;
                case '3':
                    System.out.println("删除房屋信息");

                    break;
                case '4':
                    System.out.println("修改房屋信息");
                    break;
                case '5':
                    System.out.println("----------------房屋列表----------------");
                    System.out.println("编号" + "\t\t房主" + "\t\t电话" + "\t\t地址" + "\t\t月租" + "\t\t状态（已出租/未出租）");
                    House[] houseList = houseService.list();
                    for (int i = 0; i < houseList.length; i++) {
                        if (houseList[i] == null) {
                            break;
                        }
                        System.out.println(houseList[i]);
                    }
                    break;
                case '6':
                    System.out.println("退出");
                    loop = false;
                    break;
            }
        } while (loop);
    }
}
