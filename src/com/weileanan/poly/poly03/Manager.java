package com.weileanan.poly.poly03;

public class Manager extends Employee{
   private int bonus;

    public Manager(String name, int monthSalary, int bonus) {
        super(name, monthSalary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getAnnual() {
        return super.getAnnual()+bonus;
    }

    public void manage(){
        System.out.println("经理"+getName()+"正在工作");
    }
}
