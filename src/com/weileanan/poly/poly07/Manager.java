package com.weileanan.poly.poly07;

public class Manager extends Staff {
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("经理" + this.getName() + "正在管理");
    }

    @Override
    public int getAnnual() {
        return super.getAnnual()+10*bonus;
    }
}
