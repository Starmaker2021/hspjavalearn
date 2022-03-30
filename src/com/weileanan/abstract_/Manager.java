package com.weileanan.abstract_;

public class Manager extends Employee{
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, String id, int salary,int bonus) {
        super(name, id, salary);
        this.bonus=bonus;
    }

    @Override
    public void work() {
        System.out.println("经理"+super.getName()+"正在工作");
    }
}
