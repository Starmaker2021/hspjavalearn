package com.weileanan.ChangeMoney;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        //定义相关变量
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        int sum = 0;
        int deposit = 0;
        int withdraw = 0;
        String details = "";
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String choice;
        do {
            System.out.println("\n=============零钱通明细菜单===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");

            System.out.println("请选择（1-4）：");

            key = scanner.next();

            switch (key) {
                case "1":
                    System.out.println("零钱通明细");
                    System.out.println("=============交易明细===============");
                    System.out.println("存取\t金额       日期          余额");
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账");
                    System.out.print("请输入收益金额：");
                    date = new Date();
                    deposit = scanner.nextInt();
                    sum += deposit;
                    details += "存款" + "\t" + deposit + "\t" + simpleDateFormat.format(date) + "\t" + sum + "\n";
                    break;
                case "3":
                    System.out.println("消费");
                    System.out.print("请输入取款金额：");
                    date = new Date();
                    withdraw = scanner.nextInt();
                    if (sum >= withdraw) {
                        sum -= withdraw;
                        details += "取款" + "\t" + withdraw + "\t" + simpleDateFormat.format(date) + "\t" + sum + "\n";
                    } else {
                        System.out.println("余额不足");
                    }
                    break;
                case "4":
                    System.out.println("请问是否退出 y:yes n:no");
                    choice = scanner.next();
                    boolean judge = (choice.equals("n")||choice.equals("y"));
                    while(!judge)
                    {
                        System.out.println("请重新输入");
                        choice = scanner.next();
                        judge = (choice.equals("n")||choice.equals("y"));
                    }
                    if(choice.equals("y")){
                        System.out.println("程序退出");
                        loop=false;
                    }
                    break;
                default:
                    System.out.println("选择有误");
            }
        } while (loop);


    }
}
