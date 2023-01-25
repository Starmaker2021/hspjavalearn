package thirdphase.houserent.service;


import thirdphase.houserent.domain.House;

public class HouseService {

    private House[] houses;
    public House[] houselist(int size) {
        houses = new House[size];
        houses[0] = new House(1, "张三", "774", "南安", 100, "未租出");
        return houses;
    }


}
