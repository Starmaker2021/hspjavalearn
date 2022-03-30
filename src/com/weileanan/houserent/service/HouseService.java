package com.weileanan.houserent.service;

import com.weileanan.houserent.domain.House;

public class HouseService {
    public House[] houseList;

    public HouseService(int size) {
        houseList = new House[size];
        houseList[0] = new House(1, "jack", "112", "海门区", 2000, "已出租");
    }

    //返回房屋列表
    public House[] list() {
        return houseList;
    }

    public void addHouse(String name, String phone, String address, int rent, String state) {
        int index = 0;
        while (houseList[index] != null) {
            index++;
        }
        houseList[index] = new House(index + 1, name, phone, address, rent, state);
    }

    public void delHouse(int a) {
        for (int i = a - 1; i < houseList.length; i++) {
            houseList[a - 1] = houseList[a];
        }
        System.out.println("删除成功");
    }

}
