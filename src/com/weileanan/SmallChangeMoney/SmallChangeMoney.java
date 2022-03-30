package com.weileanan.SmallChangeMoney;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeMoney {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner input = new Scanner(System.in);
        //剩余金额
        double change = 500;
        String details = "----------------零钱明细------------------";


        do {
            System.out.println("\n===============零钱通菜单===============");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退     出");
            System.out.print("请输入(1-4):");
            int key = input.nextInt();
            switch (key) {
                case 1: {
                    System.out.println(details);
                    break;
                }
                case 2: {

                    System.out.print("请输入收入金额：");
                    double inComeChange = input.nextDouble();
                    change += inComeChange;
                    //获取指定格式的时间
                    Date day = new Date();
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    details += "\n收益入账\t" + "+" + inComeChange + "\t" + df.format(day) + "\t" + change;

                    break;
                }
                case 3: {
                    System.out.print("请输入项目：");
                    String consumeItem = input.next();
                    System.out.print("请输入消费：");
                    double consumeChange = input.nextDouble();
                    change -= consumeChange;
                    //获取指定格式的时间
                    Date day = new Date();
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    details += "\n"+consumeItem+"\t" + "-" + consumeChange + "\t" + df.format(day) + "\t" + change;
                    break;
                }
                case 4: {
                    System.out.println("4.退     出");
                    loop = false;
                    break;
                }
                default:
                    System.out.println("请重新输入：");
            }
        } while (loop);
    }
}
